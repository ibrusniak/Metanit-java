package chapter3.generics.example6;

public class Parametrized <T extends Number> implements Cloneable {
    private T value;

    public Parametrized(T v) {
        value = v;
    }
    public T getValue() {
        return value;
    }
    @Override
    public Parametrized<T> clone() {
        return new Parametrized<T>(value);
    }
    @Override
    public String toString() {
        return String.format("{Value type: %s, value: %s}",
            value.getClass().getSimpleName(), value);
    }
}