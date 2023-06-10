package chapter3.example4;

import static util.Console.*;

public class Child2 extends Child1 {
    static {
        println("Child2 static initializer");
    }
    {
        println("Child2 initializer");
    }
    Child2() {
        println("Child2 constructor");
    }
}