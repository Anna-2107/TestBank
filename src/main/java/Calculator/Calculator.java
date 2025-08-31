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



        if (op == '+'){
            float result = a+b;
            System.out.println( + a + " и " + b + " = " + result);
        } else if (op == '-'){
            float result = a-b;
            System.out.println( + a + " и " + b + " = " + result);
        } else if (op == '*'){
            float result = a*b;
            System.out.println( + a + " и " + b + " = " + result);
        } else if (op == '/'){
            float result = a/b;
            System.out.println( + a + " и " + b + " = " + result);
        } else {
            System.out.println("Указанная операция не поддерживается, введи опрацию ( +, -, *, /)");
        }


    }
}
