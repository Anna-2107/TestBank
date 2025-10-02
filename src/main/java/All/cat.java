package All;// КЛАССЫ

public class cat {                     // класс

    String name;                        // поле класса
    int age;
    static int count = 0;            // Статическая переменная для отслеживания количества объектов
//static. Это значит, что она принадлежит классу, а не конкретному объекту класса


    public static void main(String[] args) {            // точк входа
        cat barsik = new cat();                      //создаём новый объект класса
        barsik.age = 3;
        barsik.name = "Барсик";
        count++;                                //переменная — count (количество)

        cat vasia = new cat();
        vasia.age = 5;
        vasia.name = "Вася";
        count++;

        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
        System.out.println("Мы создали кота по имени " + vasia.name + ", его возраст - " + vasia.age);
        System.out.println("Общее количество котов = " + count);   //Можно также написать Cat.count — это тоже будет правильно.
    }

}