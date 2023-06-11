package chapter3.example7;

import static util.Console.*;

public class Child1 extends Parent {
    void printSomeShit() {
        printf("Child1 [%s] some shit!%n", this);
    }
}