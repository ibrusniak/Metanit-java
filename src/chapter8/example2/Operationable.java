package chapter8.example2;

public interface Operationable <T extends Number> {
    public double calculate(T operandA, T operandB);
}