package chapter3.example4;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        new Child2();
        new Child2();
    }
}

// Output:
// Parent static initializer
// Child1 static initializer
// Child2 static initializer
// Parent initializer
// Parent constructor
// Child1 initializer
// Child1 constructor
// Child2 initializer
// Child2 constructor
// Parent initializer
// Parent constructor
// Child1 initializer
// Child1 constructor
// Child2 initializer
// Child2 constructor
