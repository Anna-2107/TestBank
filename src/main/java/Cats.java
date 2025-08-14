//Дефолтный конструктор исчезает из класса, когда ты создаешь какой-то конструктор с аргументами.
//если тебе в твоем классе нужно несколько конструкторов, включая пустой, его нужно создать отдельно.

public class Cats {
    String name;
    int age;
    static int count = 0;

    //для домашних котов
    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    //для уличных котов
    public Cats() {
        count++;
        this.name = "Уличный кот номер " + count;
    }

    public static void main(String[] args) {

        Cats streetCat1 = new Cats();
        Cats streetCat2 = new Cats();
        Cats barsik = new Cats("Barsik", 5);


        System.out.println(streetCat1.name);
        System.out.println(streetCat2.name);
        System.out.println(barsik.name);
        System.out.println("Общее количество котов = " + count);


    }
}

