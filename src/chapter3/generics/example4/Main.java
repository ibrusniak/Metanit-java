package chapter3.generics.example4;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        String[] array1 = new String[] {"one", "two", "three"};
        Integer[] array2 = new Integer[] {1, 2, 3, 5, 4};
        println();
        printArray(array1);
        println();
        printArray(array2);
    }
    public static <T> void printArray(T[] array) {
        for(T t : array) {
            printf("item: %s%n", t);
        }
    }
}