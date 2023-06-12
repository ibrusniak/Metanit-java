package chapter3.generics.example5;

public class SomeClass {
    private String id;

    public <T> SomeClass(T id) {
        this.id = id.toString();
    }
    public String getId() {
        return id;
    }
}