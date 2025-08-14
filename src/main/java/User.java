/* Спроектируйте класс User,  у которого будут поля — имя (String) возраст (short) и рост (int).
Создайте для него необходимое количество конструкторов, чтобы имя, возраст и рост можно было указывать в любом порядке.*/

public class User {
    String name;
    short age;
    int height;

    public User (String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public User (String name, int height, short age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public User (int height, String name, short age) {
        this.height = height;
        this.name = name;
        this.age = age;
    }
    public User (int height, short age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public User (short age, String name, int height) {
        this.age = age;
        this.height = height;
        this.name = name;
    }
    public User (short age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public static void main(String[] args) {
        // Создание объектов с помощью разных конструкторов
        User user1 = new User("Alex", (short) 30, 180); // String, short, int
        User user2 = new User("Alex", 180, (short) 30); // String, int, short
        User user3 = new User((short) 30, "Alex", 180); // short, String, int

        System.out.println("User 1: " + user1.name + ", " + user1.age + ", " + user1.height);
        System.out.println("User 2: " + user2.name + ", " + user2.age + ", " + user2.height);
        System.out.println("User 3: " + user3.name + ", " + user3.age + ", " + user3.height);
    }
}

