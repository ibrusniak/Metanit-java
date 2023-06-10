package chapter3.accessmodifiers.package2;

import static util.Console.*;

public class Class2 {
    public void doSomething() {
        Class1 c1 = new Class1();
        println(c1.publicField);
        println(c1.protectedField);
        println(c1.defaultAccesField);

        // privateField has private access in Class1
        // println(c1.privateField);
    }
}
