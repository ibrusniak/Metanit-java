
package utils;

public class ConsoleOutput {

    public static <T> void print(T object) {
        System.out.print(object);
    }

    public static <T> void println(T object) {
        System.out.println(object);
    }

    public static void printf(String format, Object... args) {
        System.out.printf(format, args);
    }
}

