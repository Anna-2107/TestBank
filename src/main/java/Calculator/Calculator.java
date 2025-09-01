package Calculator;

import java.util.Scanner;


public class Calculator {
    public void runCalculator() {

        Scanner sc = new Scanner(System.in);
        System.out.println("введи первое число");
        float a = sc.nextFloat();                               //режим ожидания для ввода
        System.out.println("введи опрацию ( +, -, *, /)");
        char op = sc.next().charAt(0);                      //прсим ввести слово, берём 1 символ
        System.out.println("введи второе число");
        float b = sc.nextFloat();

        ICalculator obj;
        //float result = 0;

        if (op == '+'){
            obj = new Plus();
        } else if (op == '-'){
            obj = new Minus();
        } else if (op == '*'){
            obj = new Multiply();
        } else if (op == '/'){
            obj = new Divide();

        } else {
            System.out.println("Указанная операция не поддерживается, введи опрацию ( +, -, *, /)");
            return;
        }

        double result = obj.calculate(a,b);
        System.out.println( + a + " и " + b + " = " + result);

        sc.close();
    }
}
