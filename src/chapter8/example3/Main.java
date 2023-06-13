package chapter8.example3;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        Functional<Integer, Double> op1 = x -> (double)(x * x);
        println(op1.execute(2));
    }
}