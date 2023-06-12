package util;

public class Console {

    public static <T> void printf(String pattern, T... args) {
        System.out.printf(pattern, args);
    }
    public static <T> void print(T o) {
        System.out.print(o);
    }
    public static void println() {
        System.out.println();
    }
    public static <T> void println(T o) {
        System.out.println(o);
    }
}