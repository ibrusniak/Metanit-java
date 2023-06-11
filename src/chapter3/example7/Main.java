package chapter3.example7;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        Parent ref;
        ref = new Parent();
        printSomeShit(ref);
        ref = new Child1();
        printSomeShit(ref);
        ref = new Child2();
        printSomeShit(ref);
    }
    private static void printSomeShit(Parent ref) {
        ref.printSomeShit();
    }
}

// Output:
// Parent [chapter3.example7.Parent@681a9515] some shit!
// Child1 [chapter3.example7.Child1@19469ea2] some shit!
// Child2 [chapter3.example7.Child2@2f2c9b19] some shit!
