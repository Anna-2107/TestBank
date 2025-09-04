package CalculatorFile2;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Запуск");

        CalculatorFileOptim myCalculatorFileOptim = new CalculatorFileOptim();
        myCalculatorFileOptim.runCalculatorFileOptim();
    }
}

