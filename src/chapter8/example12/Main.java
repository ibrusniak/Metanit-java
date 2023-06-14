package chapter8.example12;

import static util.Console.*;

public class Main {

    public static void main(String[] args) {

        SomeClass sc1 = new SomeClass();
        SomeClass.SomeInnerClass sic1 = sc1.new SomeInnerClass();
        println(sc1);
        println(sic1);
        println(sic1.getX1());
        println(sic1.getX2());

        // Output:
        // chapter8.example12.SomeClass@279f2327
        // chapter8.example12.SomeClass$SomeInnerClass@2ff4acd0
        // 100
        // 100

        SomeClass.SomeInnerClass sic2 = sc1.getSomeInnerClassInstance1();
        SomeClass.SomeInnerClass sic3 = sc1.getSomeInnerClassInstance2();
        println(sic2);
        println(sic3);
        println(sic3.getX1());
        println(sic3.getX2());

        // Output:
        // chapter8.example12.SomeClass$SomeInnerClass@54bedef2
        // chapter8.example12.SomeClass$SomeInnerClass@5caf905d
        // 100
        // 100

        SomeClass sc2 = new SomeClass();
        SomeClass.SomeInnerClass sic4 = sc2.new SomeInnerClass();
        println();
        println(sc2);
        println(sic4);
        println(sc2.equals(sic4.getOuterThis())); // true

        // Output:
        // chapter8.example12.SomeClass@27716f4
        // chapter8.example12.SomeClass$SomeInnerClass@8efb846
        // true
    }
}