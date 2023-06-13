package chapter8.example9;

import static util.Console.*;

import java.util.function.Predicate;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        int v = 3;
        println("Testing \"java.util.fuction.Predicate\"");
        if(isEven.test(v))
            printf("%d is even.%n", v);
        else
            printf("%d is not even.%n", v);
        println("Testing \"java.util.fuction.Consumer\"");
        Consumer<Object> eatRefrense = (Object x) -> {
            println(x); // normal
            x = null;
            println(x); // null
        };
        Object ref = new Object();
        eatRefrense.accept(ref);
        println(ref); // normal again!
    }
}