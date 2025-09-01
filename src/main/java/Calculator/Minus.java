package Calculator;

public class Minus implements ICalculator{
    @Override
    public double calculate(float a, float b) {
        return a-b;
    }
}
