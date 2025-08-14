/*Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
Второй — о которых известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
Третий вид — о которых известен порядковый номер, культура, которой он был создан, и точный век его создания (например: 212121, "Ацтеки", 12).
*/

public class Artefact {
    int number;
    String cultura;
    int vek;
   // static int count = 0;

    public Artefact (int number) {
        this.number = number;
    }

    public Artefact (int number, String cultura) {
        this.number = number;
        this.cultura = cultura;
    }

    public Artefact (int number, String cultura, int vek) {
        this.number = number;
        this.cultura = cultura;
        this.vek = vek;
    }

public static void main(String[] args) {
    Artefact one = new Artefact (212121);
    Artefact two = new Artefact (212121, "Ацтеки");
    Artefact three = new Artefact (212121, "Ацтеки", 12);


 System.out.println("Артефакт 1: " + one.number);
        System.out.println("Артефакт 2: " + two.number + ", " + two.cultura);
        System.out.println("Артефакт 3: " + three.number + ", " + three.cultura + ", " + three.vek);
}}