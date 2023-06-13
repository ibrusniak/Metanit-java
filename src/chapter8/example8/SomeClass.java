package chapter8.example8;

public class SomeClass {
    private int v;
    public SomeClass(int v) {
        this.v = v;
    }
    @Override
    public String toString() {
        return
            String.format("[%s@%s]v=%d",
                getClass(), hashCode(), v);
    }
}