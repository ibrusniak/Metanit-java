
package chapter3.example4;

import static util.Console.*;

public class Parent {
    static {
        println("Parent static initializer");
    }
    public Parent() {
        println("Parent constructor");
    }
    {
        println("Parent initializer");
    }
}