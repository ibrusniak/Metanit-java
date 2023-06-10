package chapter3.innerclassesdemo;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        SomeClass sc1 = new SomeClass("Some string value");
        sc1.printStr();
        SomeClass.Nested1 n1 = sc1.new Nested1();
        n1.changeOuterStr("New string value");
        sc1.printStr();
        
        // Error: SomeClass.Nested2 has private access in SomeClass
        // SomeClass.Nested2 n2 = sc1.new Nested2();
        var n3 = sc1.getNested2Instance();
        println(n3);
    }
}
