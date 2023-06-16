package chapter10.ex8;

import java.util.stream.IntStream;
import java.util.OptionalInt;

public class Demo0 {

    public static void main(String[] args) {

        OptionalInt factorial =
            IntStream.of(1, 2, 3, 4, 5)
                .reduce((w, z) -> w * z);
        
        System.out.println(factorial.getAsInt());
    }
}