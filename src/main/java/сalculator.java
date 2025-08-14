

public class сalculator {

    public double sum (double a, double b) {
        return a + b;
    }
    public double min (double a, double b) {
        return a - b;
    }
    public double umn (double a, double b) {
        return a * b;
    }
    public double del (double a, double b) {
        if (b == 0) {
            System.out.println ("На ноль делить нельзя!");
            return Double.NaN;
        } else {
        return a / b;
    }}

    public static void main(String[] args) {
        сalculator Calculator = new сalculator();

        double num1 = 66.8;
        double num2 = 33.4;

        double boxsum = Calculator.sum (num1, num2);
        double boxmin = Calculator.min (num1, num2);
        double boxumn = Calculator.umn (num1, num2);
        double boxdel = Calculator.del (num1, num2);
        double boxdelZero = Calculator.del (num1, 0);

        System.out.println("Сложение: " + num1 + " + " + num2 + " = " + boxsum);
        System.out.println("Вычитние: " + num1 + " - " + num2 + " = " +  boxmin);
        System.out.println("Умножение: " + num1 + " * " + num2 + " = " +  boxumn);
        System.out.println("Деление: " + num1 + " / " + num2 + " = " +  boxdel);
        System.out.println("Деление на 0 : " + num1 + " / " + 0 + " = " +  boxdelZero);

    }
}
