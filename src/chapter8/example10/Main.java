package chapter8.example10;

import static util.Console.*;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        new Main().try_it();
    }
    public Function<Integer, Integer> make_fun() {
        int n = 0;
        return arg -> {
            printf("%s %s: ", n, arg);
            arg += 1;
            return n + arg;
        };
    }
    public void try_it() {
        Function<Integer, Integer>
            x = make_fun(),
            y = make_fun();
        for(int i = 0; i < 5; i++)
            println(x.apply(i));
        for(int i = 10; i < 15; i++)
            println(y.apply(i));
    }
}