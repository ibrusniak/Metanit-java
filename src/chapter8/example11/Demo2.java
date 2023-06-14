package chapter8.example11;

import static util.Console.*;

public class Demo2 {
    
    public static void main(String[] args) {

        SomeClass2.StaticNestedClass1 c1 = new SomeChildClass2(200, 300);

        println(c1);
        println(c1.getX());

        // error: cannot find symbol
        // println(c1.getY());
        //           ^
        // symbol:   method getY()
        // location: variable c1 of type StaticNestedClass1
        // println(c1.getY());

        println(((SomeChildClass2)c1).getY()); // ok
    }
}
