package CalculatorFile2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculatorFileOptim {

    public void runCalculatorFileOptim() throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "home" + separator + "DN210793PAJ" + separator +
                "Стільниця" + separator + "CFile" + separator + "CalcF.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        int counter = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            counter++;

            try {
                String[] numbersString = line.split("[ ,&]+");
                float[] numbers = new float[numbersString.length];

                for (int i = 0; i < numbersString.length; i++) {
                    numbers[i] = Float.parseFloat(numbersString[i]);
                }

                IntCalcFile operation = null;

                switch (counter) {
                    case 1: operation = new Plus(); break;
                    case 2: operation = new Minus(); break;
                    case 3: operation = new Multiply(); break;
                    case 4: operation = new Divide(); break;
                    default:
                        System.out.println("Нет операции для строки " + counter);
                        continue;
                }

                float result = operation.calculate(numbers);
                System.out.println("Строка " + counter + " (" + operation.getSymbol() + "): результат = " + result);

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: неверный формат числа в строке " + counter);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage() + " в строке " + counter);
            }
        }

        scanner.close();
    }
}
