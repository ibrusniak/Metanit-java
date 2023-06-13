package chapter8.example5;

import static util.Console.*;
import chapter8.example3.Functional;

public class Main {
    static int a = 100;
    
    public static void main(String[] args) {
        Functional<Integer, Integer> op1 = x -> a = a + x;
        println(a);
        op1.execute(200);
        println(a);
    }
}