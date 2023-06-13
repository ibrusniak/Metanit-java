package chapter8.example8;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        Functional constructor = SomeClass::new;
        SomeClass s1 = constructor.execute(20);
        println(s1);
    }
}