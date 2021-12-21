
package utils;

public class Printer {

    public static void println(Object o) {

        System.out.println(o);
    }

    public static void printMessageTestStarts(Object o) {
        
        println("[" + o.getClass().getSimpleName() + "] test start:\n");
    }
}

