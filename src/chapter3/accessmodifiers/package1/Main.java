package chapter3.accessmodifiers.package1;

import chapter3.accessmodifiers.package2.*;
import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        Class2 c2 = new Class2();
        c2.doSomething();
        Class1 c1 = new Class1();
        println();
        println(c1.publicField);

        // protectedField has protected access in Class1
        // println(c1.protectedField);
    }
}