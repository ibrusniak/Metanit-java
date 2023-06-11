package chapter3.example5;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent poly = new Child();
        println(parent);
        parent.someMethod();
        println(child);
        child.someMethod();
        println(poly);
        poly.someMethod();
        ((Parent)poly).someMethod();
    }
}

// Output:
// chapter3.example5.Parent@279f2327
// Parent.someMethod()
// chapter3.example5.Child@2ff4acd0
// Child.someMethod()
// chapter3.example5.Child@54bedef2
// Child.someMethod()
// Child.someMethod()
