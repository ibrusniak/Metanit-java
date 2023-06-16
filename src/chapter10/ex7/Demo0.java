package chapter10.ex7;

import java.util.stream.IntStream;
import java.util.function.IntConsumer;

public class Demo0 {

    public static void main(String[] args) {

        IntConsumer consumer = w -> System.out.print(w + " ");

        IntStream.of(2, 3, 1)
            .sorted()
            .forEach(consumer);
        
        System.out.println();

        IntStream.of(2, 3, 1)
            .flatMap(x -> IntStream.of(x*2, x*3))
            .sorted()
            .forEach(consumer);
        
        System.out.println();
    }
}