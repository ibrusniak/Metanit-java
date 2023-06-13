package chapter8.example7;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        int x = 200;
        SomeFunctionalInterface s1 = q -> println("Foo: " + q);
        SomeFunctionalInterface s2 = System.out::println;
        dododoSmth(s1, x);
        dododoSmth(s2, x);
        dododoSmth(Main::someShitFunc, x);
    }
    private static void dododoSmth(SomeFunctionalInterface f, int x) {
        f.terminalOp(x);
    }
    private static void someShitFunc(int x) {
        println("Some shit func: " + x);
    }
}