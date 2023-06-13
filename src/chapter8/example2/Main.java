package chapter8.example2;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        Operationable<Integer> op = (a, b) -> a + b;
        double d = op.calculate(2, 3);
        println(d);
    }
}