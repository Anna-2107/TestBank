//Этот класс представляет одну строку из вашего CSV-файла и реализует принцип Инкапсуляции (закрывает данные от прямого доступа).

package Task_Manager;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;

public class ErrorEntry {

    private String id;
    private LocalDate date;
    private String branch;
    private String errorType;
    private String platform;
    private String taskId;
    private final Map<String, String> extraFields = new HashMap<>();            // Новое поле для хранения дополнительных, неизвестных столбцов


    //Полный конструктор: Нужен для создания объекта из данных, прочитанных из файла.
public ErrorEntry(String id, LocalDate date, String branch,String errorType, String platform, String taskId) {
        this.id = id;
        this.date = date;
        this.branch = branch;
        this.errorType = errorType;
        this.platform = platform;
        this.taskId = taskId;
}

    //Геттер (get...): Позволяет прочитать значение поля.
public String getId() {return  id;}
public LocalDate getDate() {return date;}
public String getBranch() {return branch;}
public String getErrorType() {return errorType;}
public String getPlatform() {return platform;}
public String getTaskId() {return taskId;}
    public Map<String, String> getExtraFields() {
        return extraFields;
    }

    //Сеттер (set...): Позволяет изменить значение поля (нужен для редактирования).
public void setBrunch(String branch) {this.branch = branch;}
public void setErrorType(String errorType) {this.errorType = errorType;}
public void setPlatform(String platform) {this.platform = platform;}
public void setTaskId(String taskId) {this.taskId = taskId;}

    // Метод для удобного сохранения в CSV-формате - помогает нам легко преобразовать объект обратно в строку для записи в файл.
public String toCsvString() {
    return String.join(",",
            id,
            date.toString(),
            branch,
            errorType,
            platform,
            taskId
        );
    }
}
