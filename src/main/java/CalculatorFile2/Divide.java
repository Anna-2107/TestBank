package CalculatorFile2;

public class Divide implements IntCalcFile{
    @Override
    public float calculate(float[] numbers) {
        float result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                System.out.println("Ошибка: деление на ноль!");
                continue;
            }
            result /= numbers[i];
        }
        return result;
    }
    public String getSymbol(){
        return "+";
    }
}
