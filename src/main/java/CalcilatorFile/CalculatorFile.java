package CalcilatorFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CalculatorFile {

    public static void main(String[] args) throws FileNotFoundException {           //Если файл не нйден - исключение

        String separator = File.separator;                  //определяем систему винд или линукс
        String path = separator + "home" + separator +  "DN210793PAJ" + separator + "Стільниця" + separator + "CFile"+ separator + "CalcF.txt";
        File file = new File(path);
        //File file = new File("testFile");

        Scanner scanner = new Scanner(file);
        int counter = 0;                   //счётчик строк

        //цикл для обработки всех строк hasNextLine
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            counter++;


            try {   //код, которій может упсть - не число - передаст ошибку в catch

                String[] numbersString = line.split("[ ,&]+");

                // преобразуем строки в числа
                float[] numbers = new float[numbersString.length];  // масс длина = кол єлем в numbersString (фикс размер)
                for (int i = 0; i < numbersString.length; i++){
                    numbers[i] = Float.parseFloat(numbersString[i]); //преобразовать строку в число типа float
                }

                float result = numbers[0];
                String operatorSymbol = "";

                switch (counter){
                    case 1:
                    operatorSymbol = "+";
                    for (int i = 1; i < numbers.length; i++){
                        result += numbers[i];
                    }
                        break;
                    case 2:
                        operatorSymbol = "-";
                        for (int i = 1; i < numbers.length; i++){
                            result -= numbers[i];
                        }
                        break;
                    case 3:
                        operatorSymbol = "*";
                        for (int i = 1; i < numbers.length; i++){
                            result *= numbers[i];
                        }
                        break;
                    case 4:
                        operatorSymbol = "/";
                        for (int i = 1; i < numbers.length; i++){
                            if (numbers[i] == 0){
                                System.out.println("Ошибка: деление на ноль в строке " + counter);
                                continue;                   //прерывает текущую итерацию и сразу переходит к следующей.
                            }
                            result /= numbers[i];
                        }
                        break;
                    default:
                        System.out.println("Условие не корректно в строке " + counter);
                        continue;
                }

                // вывод результата
                System.out.println("Строка " + counter + " (" + operatorSymbol + "): результат = " + result);

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: неверный формат числа в строке " + counter);
            }
    }

        scanner.close();   // закрыть поток чтоб ресурсы освобождались
}
}