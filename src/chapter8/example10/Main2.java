package chapter8.example10;

import static util.Console.*;

import java.util.function.Consumer;

public class Main2 {
    public static void main(String[] args) {
        SomeClass s1 = new SomeClass(10);
        Consumer<SomeClass> consumer1
            = arg -> arg.setI(arg.getI() + 100);
        // Lambda function changes outer mutable value
        println(s1); // [SomeClass@468121027][i=10]
        consumer1.accept(s1);
        println(s1); // [SomeClass@468121027][i=110]
        Consumer<SomeClass> consumer2
            = arg -> arg = null;
        println(s1); // [SomeClass@468121027][i=110]
        consumer2.accept(s1);
        println(s1); // [SomeClass@468121027][i=110]
        int f = 200;
        final int q = 300;
        Consumer<Integer> consumer3 =
            // error: local variables referenced from a
            // lambda expression must be final or effectively final
            // arg -> f += arg;
            // error: cannot assign a value to final variable q
            // arg -> q += 10;
            arg -> {
                int[] array = new int[]{f};
                array[0] *= 2;
            };
        println(f); // 200
        consumer3.accept(f);
        println(f); // 200
        
        // So we can't change local variable inside
        // a lambda function.
    }
}