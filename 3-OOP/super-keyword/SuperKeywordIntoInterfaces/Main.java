
public class Main {

    public static void main(String[] args) {
        
        (new Class1()).method();
    }
}

interface A {

    default void method() {
        System.out.println("default void method() from A");
    };
}

interface B {

    default void method() {
        System.out.println("default void method() from B");
    };
}

interface C extends A, B {
    
    default void method() {
        A.super.method();
        B.super.method();
        System.out.println("default void method() from C");
    }
}

class Class1 implements C {}

