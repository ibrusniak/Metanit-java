package chapter3.example3.mainpackage;

import chapter3.example3.package1.*;
import chapter3.example3.package2.*;

public class Application {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();
        var c3 = c2.createNewClass3();
        System.out.println(c3);
        // Class3 has default (package) access
        // so can not instantiate directly
        // Class3 c4 = new Class3();
    }
}