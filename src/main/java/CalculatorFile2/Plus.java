package CalculatorFile2;

public class Plus implements IntCalcFile{
    @Override
    public float calculate(float[] numbers) {
        float result = 0;
        for (float num : numbers){
            result += num;
        }
        return result;
    }
    public String getSymbol(){
        return "+";
}}
