package chapter10.ex6;

import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Demo0 {

    public static void main(String[] args) {

        Stream.of(args)
            .map(x -> Integer.valueOf(x))
            .sorted()
            .forEach(x -> System.out.print(x + " "));

        long sum =
            Stream.of(args)
                .mapToInt(Integer::valueOf)
                .sum();
        
        System.out.println(sum);
    }
}