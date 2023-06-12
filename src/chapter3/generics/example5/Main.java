package chapter3.generics.example5;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        SomeClass s1 = new SomeClass(100);
        println(s1.getId());

        SomeClass s2 = new SomeClass("ID000001");
        println(s2.getId());

        SomeClass s3 = new SomeClass(3.2f);
        println(s3.getId());
    }
}