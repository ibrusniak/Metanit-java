package chapter8.example3;

public interface Functional <T extends Number, V extends Number> {
    public V execute(T operand);
}