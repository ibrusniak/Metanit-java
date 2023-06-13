package chapter8.example4;

import static util.Console.*;
import chapter8.example3.Functional;

public class Main {
    public static void main(String[] args) {
        final int a = 2;
        Functional<Integer, Integer> op = x -> x * 2;
        println(op.execute(a));
        Functional<Integer, Integer> o2 = f -> a + f;
        int c = o2.execute(100);
        println(a);
        println(c);
        println(a - 3);
    }
}