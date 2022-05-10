
import java.util.stream.Stream;

import java.util.Arrays;

public class IntermediateOperations {



    public static void main(String[] args) {

        System.out.println();
        showFlatMap1();
        System.out.println();
        showFlatMap2();
    }

    private static void showFlatMap1() {

        String source = """
            This is multi-line string.
            This string is source for our stream.
            It has created to demonstrate how `flatMap` operator works.
        """;

        System.out.println(source);

        Stream<String> stream = Arrays.stream(source.split("\n"));

        stream
            .flatMap(s -> Arrays.stream(s.split(" ")))
            .forEach(s -> System.out.println(s));
    }

    private static void showFlatMap2() {

        Stream.of("How are you".split(" "))
            .flatMap(s -> Stream.of(s.split("")))
            .forEach(c -> System.out.print(c + "  "));
        
        System.out.println();
    }
}


