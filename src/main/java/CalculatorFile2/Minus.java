package CalculatorFile2;

public class Minus implements IntCalcFile{
    @Override
    public float calculate(float[] numbers) {
        float result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
    public String getSymbol(){
        return "-";
}}
