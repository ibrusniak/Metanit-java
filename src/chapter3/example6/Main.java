package chapter3.example6;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        Parent p1;
        Child c1;
        p1 = new Child();
        c1 = ((Child)(new Parent()));
        p1.method();
        c1.method();
    }
}

// Compiles but:
// Exception in thread "main" java.lang.ClassCastException: class chapter3.example6.Parent
// cannot be cast to class chapter3.example6.Child (chapter3.example6.Parent and chapter3.example6.Child
// are in unnamed module of loader 'app')
//         at chapter3.example6.Main.main(Main.java:10)
