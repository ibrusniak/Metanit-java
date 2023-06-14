package chapter8.example13;

import static util.Console.*;

public class Main {

    public static void main(String[] args) {
        SomeClass sc = new SomeClass();
        var d = sc.doSmth();
        println(d);
        // Output:
        // chapter8.example13.SomeClass$1LoclalClass1@279f2327
    }
}