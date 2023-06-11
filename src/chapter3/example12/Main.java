package chapter3.example12;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {

        Object o1 = new Object();
        printInfo(o1);
        Object o2 = new Object();
        printf("o1 == o2: %s%n", o1 == o2);
        printf("o1.equals(o2): %s%n", o1.equals(o2));
        // o2 = o1.clone(); // error
        String string1 = new String("hello");
        String string2 = new String("hello");
        printf("string1 == string2: %s%n", string1 == string2); // false!
        printf("string1.equals(string2): %s%n", string1.equals(string2)); // true
        String string3 = string2;
        printf("string2 == string3: %s%n", string2 == string3); // false!
        printf("string2.equals(string2): %s%n", string2.equals(string3)); // true
    }

    private static void printInfo(Object o) {
        printf("""
        toString() = \"%s\";
        getClass() = \"%s\";
        hashCode() = \"%s\";
        """,
        o.toString(),
        o.getClass(),
        o.hashCode());
    }
}
