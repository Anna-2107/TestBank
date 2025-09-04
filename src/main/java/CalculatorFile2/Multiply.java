package CalculatorFile2;

public class Multiply implements IntCalcFile{
    @Override
    public float calculate(float[] numbers) {
        float result = 1;
        for (float num : numbers) {
            result *= num;
        }
        return result;
    }
    public String getSymbol(){
        return "*";
}}
