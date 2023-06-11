package chapter3.example5;

import static util.Console.*;

public class Child extends Parent {

    @Override
    public void someMethod() {
        println("Child.someMethod()");
    }
    public void someMethod2(String s) {
        println("Child.someMethod2() overloaded " + s);
    }
}
