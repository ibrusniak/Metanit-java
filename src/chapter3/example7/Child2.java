package chapter3.example7;

import static util.Console.*;

public class Child2 extends Child1 {
    void printSomeShit() {
        printf("Child2 [%s] some shit!%n", this);
    }
}