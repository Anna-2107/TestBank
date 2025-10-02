//Этот код представляет собой класс ErrorFileRepository, который действует как "хранилище" или "менеджер" для записей об ошибках (ErrorEntry),
// используя обычный файл в формате CSV для сохранения и загрузки данных.

package Task_Manager;
    //"подключаем" библиотеки, которые содержат нужные инструменты:
import Task_Manager.ErrorEntry;
import java.io.FileReader;
import java.io.BufferedReader;
//import java.io.*; // Инструменты для работы с Вводом/Выводом (файлами)
import java.time.LocalDate; // Инструменты для работы с датами (без времени)
import java.util.ArrayList; // Инструмент для создания динамического списка
import java.util.List; // Общий тип (интерфейс) для списка


//главный "Контейнер" для всех методов. Его задача — управлять сохранением и загрузкой данных об ошибках в файл.
public class ErrorFileRepository {
    private static final String CSV_DELIMITER = ",";        //Это "постоянная" (неизменяемая) переменная. Она хранит символ, который мы используем для разделения данных в файле CSV. В данном случае это запятая (,). Используется для удобства: если вдруг формат изменится, менять нужно будет только это место.

// 1. Метод для загрузки данных из файла
public List<ErrorEntry> loadAll (String filename) {
    List<ErrorEntry> entries = new ArrayList<>();                                    //Создаётся пустой динамический список (ArrayList), куда мы будем складывать все прочитанные из файла объекты ErrorEntry.

    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {     //FileReader(filename): Открывает файл, указанный в переменной filename. //BufferedReader(новый FileReader): Это "упаковка" для FileReader. Он не читает по одному символу, а читает целыми строками, что намного быстрее.

// 1. Читаем и парсим ЗАГОЛОВОК
    String headerline = br.readLine();
        if (headerline == null) {
            return entries;             // Пустой файл
        }
        String[] headers = headerline.split(CSV_DELIMITER);

        String line;
    while ((line = br.readLine()) != null) {                                        //цикл работает, пока след строка не = 0 Присваивает эту считанную строку переменной line
        String[] parts = line.split(CSV_DELIMITER);

// Проверяем, что количество данных соответствует хотя бы минимально необходимому
    if (parts.length < 6) {
        System.err.println("Ошибка: недостаточно полей в строке: " + line);
        continue;
    }

// 2. Парсим ОБЯЗАТЕЛЬНЫЕ ПОЛЯ по известным индексам/именам
// Мы предполагаем, что первые 6 полей ВСЕГДА идут в одном порядке.
        try {
            String id = parts[0];
            LocalDate date = LocalDate.parse(parts[1]);
            String branch = parts[2];
            String errorType = parts[3];
            String platform = parts[4];
            String taskId = parts[5];

            ErrorEntry entry = new ErrorEntry(id, date, branch, errorType, platform, taskId);

// 3. Парсим ДОПОЛНИТЕЛЬНЫЕ ПОЛЯ (начиная с 6-го индекса)
     if (parts.length > 6) {
         for (int i = 6; i < parts.length; i++) {
             String headerName = headers[i];
             String value = parts[i];
             entry.getExtraFields().put(headerName, value);   //Map для хранения неструктурированных данных (в данном случае, extraFields).
         }
     }
            entries.add(entry);
        } catch (Exception e) {
            System.err.println("Ошибка парсинга строки: " + line + ". Пропускаем.");
        }
    }
    } catch (java.io.IOException e) {
        System.err.println("Ошибка при чтении файла " + filename + ": " + e.getMessage());
        return new ArrayList<>();
    }
    return entries;

        }
    }

