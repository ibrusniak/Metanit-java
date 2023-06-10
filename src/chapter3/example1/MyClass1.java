package chapter3.example1;

public class MyClass1 {

    static {
        System.out.println("static initializer.");
    }
    {
        System.out.println("initializer.");
    }
    MyClass1() {
        System.out.println("constructor \"()\"");
    }
    public static void main(String[] args) {
        new MyClass1();
        new MyClass1();
        new MyClass1();
    }
}