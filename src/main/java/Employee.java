// функции-конструкторы - Конструктор — это, по сути, шаблон для объектов класса.
//Это специальный метод, который вызывается автоматически, когда вы создаёте новый объект.

public class Employee {
    String name;
    int age;

    public Employee(String name, int age) {           //конструктор для класса Cat
        this.name = name;                    //this.name = name;: Эта строка присваивает значение.
        this.age = age;
    }

    public static void main(String[] args) {
        Employee barsik = new Employee("Барсик", 5);
        System.out.println(barsik.name);
        System.out.println(barsik.age);
    }
}

