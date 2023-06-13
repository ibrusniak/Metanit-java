package chapter8.example1;

import static util.Console.*;

public class Main1 {
    public static void main(String[] args) {
        Operationable op = (x, y) -> x + y;
        println(op.calculate(20, 30));
        Operationable[] operations = new Operationable[3];
        operations[0] = (a, b) -> a * b;
        operations[1] = (a, b) -> a * a * b;
        operations[2] = (c, d) -> d - c;
        for(Operationable o : operations) {
            println(o.calculate(200, 50));
        }
    }
}