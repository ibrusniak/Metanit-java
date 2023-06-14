package chapter8.example11;

import static util.Console.*;

public class Demo1 {

    public static void main(String[] args) {

        SomeClass1.StaticNestedClass1 nested1
            = new SomeClass1.StaticNestedClass1();
        
        //  error: StaticNestedClass2 has private access in SomeClass1
        // SomeClass1.StaticNestedClass1 nested2
        //     = new SomeClass1.StaticNestedClass2();

        SomeClass1.StaticNestedClass3 nested3
            = new SomeClass1.StaticNestedClass3();
        
        nested3.printOuterX();
        println(nested3);

        println();
        SomeClass1.StaticNestedClass4<Integer> nested4
            = new SomeClass1.StaticNestedClass4<>();
        nested4.accept(200);

        // error: StaticNestedClass2 has private access in SomeClass1
        // SomeClass1.StaticNestedClass2 nested5 = SomeClass1.getStaticNestedInstance();

        // but
        var nested6 = SomeClass1.getStaticNestedInstance(); // Ok!
        // nope...
        // error: StaticNestedClass2.printSmth() is defined in an inaccessible class or interface
        // nested6.printSmth();

    }
}