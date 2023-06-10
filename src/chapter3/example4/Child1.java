package chapter3.example4;

import static util.Console.*;

public class Child1 extends Parent {
    static {
        println("Child1 static initializer");
    }
    {
        println("Child1 initializer");
    }
    Child1() {
        println("Child1 constructor");
    }
}