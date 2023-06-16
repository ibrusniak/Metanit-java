package chapter10.ex5;

import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Arrays;

public class Demo0 {

    public static void main(String[] args) {

        Stream.of("A", "B", "C").forEach(Demo0::println);
        int[] arr = new int[] {7, 3, 2, 4, 2, 3};

        long sum = IntStream.of(arr)
            .sum();
        println(sum);

        Stream.of(args)
            .forEach(arg -> System.out.printf("[arg='%s']%n", arg));

        Stream.of("1", "2", "3")
            .map(x -> Integer.valueOf(x))
            .forEach(System.out::println);
    }
    private static <T> void println(T t) {
        System.out.println(t);
    }
}