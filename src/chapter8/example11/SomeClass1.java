package chapter8.example11;

import static util.Console.*;

import java.util.function.Consumer;

public class SomeClass1 {

    private static int x;

    static {
        x = 100;
    }

    static class StaticNestedClass1 {}

    private static class StaticNestedClass2 {

        public void printSmth() {
            println("This is StaticNestedClass2.printSmth(). " + this);
        }
    }
    
    public static class StaticNestedClass3 {

        public void printOuterX() {
            printf("private SomeClass1.x = %d%n", x);
        }
    }

    public static class StaticNestedClass4<T> implements Consumer<T> {

        @Override
        public void accept(T arg) {
            printf("This is accept from static nested class. arg = {%s}%n", arg);
        }
    }

    public static StaticNestedClass2 getStaticNestedInstance() {
        return new StaticNestedClass2();
    }
}