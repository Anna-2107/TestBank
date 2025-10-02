package Task_Manager;

import java.util.List;                  //Сообщает компилятору, что мы будем использовать интерфейс List (для списка загруженных ошибок).
import Task_Manager.ErrorEntry;         //Импортирует нашу модель данных (ErrorEntry), чтобы мы могли создавать и обрабатывать объекты этого типа.


public class TestApp {

// 1. Создание экземпляра репозитория
    public static void main(String[] args) {
        ErrorFileRepository repository = new ErrorFileRepository();     //создание нашего "Секретаря" (класса, который умеет читать и писать в файл). вызвать  методы ErrorFileRepository
        String filename = "errors.csv";                                  //Указываем, какой файл будем тестировать.
                System.out.println("--- Начинаем тестирование загрузки данных ---");

        // 2. Вызов метода загрузки
        List<ErrorEntry> loadedEntries = repository.loadAll(filename);      //Результат работы loadAll (список всех прочитанных объектов ErrorEntry) сохраняется в переменной loadedEntries.

        System.out.println("\n--- Результаты загрузки ---");
        System.out.println("Общее количество успешно загруженных записей: " + loadedEntries.size());

        // 3. Проверка каждой записи
        for (ErrorEntry entry : loadedEntries) {                            //: Это цикл "для каждого". Он поочередно берет каждый объект ErrorEntry из списка loadedEntries и помещает его в переменную entry.
            System.out.println("---------------------------------");

            // Вывод обязательных полей
            System.out.printf("ID: %s | Date: %s | Branch: %s | ErrorType: %s | Name: %s | Platform: %s | TaskId: %s\n",       //Используется для форматированного вывода.
// ... вывод геттеров
                    entry.getId(),
                    entry.getDate(),
                    entry.getBranch(),
                    entry.getErrorType(),
                    entry.getName(),
                    entry.getPlatform(),
                    entry.getTaskId()
            );
            // Вывод дополнительных полей
            if (!entry.getExtraFields().isEmpty()) {
                System.out.println("  Дополнительные поля:");
                entry.getExtraFields().forEach((k, v) ->
                        System.out.println("    " + k + ": '" + v + "'")
                );
            } else {
                System.out.println("  Дополнительных полей нет.");
            }
        }
        System.out.println("---------------------------------");
    }
}
