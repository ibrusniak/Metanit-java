package util;

public class Console {

    public static void printf(String pattern, Object... args) {
        System.out.printf(pattern, args);
    }
    public static void print(Object o) {
        System.out.print(o);
    }
    public static void println() {
        System.out.println();
    }
    public static void println(Object o) {
        System.out.println(o);
    }
}