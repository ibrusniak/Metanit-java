
package com.brusniak.utils;

public class ConsolePrinter {

    public static <T> void print(T obj) {

        System.out.print(obj);
    }

    public static void print(String format, Object... args) {
        
        System.out.printf(format, args);
    }

    public static <T> void println(T obj) {

        System.out.println(obj);
    }

    public static void println(String format, Object... args) {

        System.out.printf(format + "\n", args);
    }
}
