package chapter3.generics.example3;

public class ParametrizedClass<T> {
    private T f;

    public ParametrizedClass(T f) {
        this.f = f;
    }
    public T getF() {
        return f;
    }
}