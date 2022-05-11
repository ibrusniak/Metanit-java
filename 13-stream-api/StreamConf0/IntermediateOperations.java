
import java.util.stream.Stream;

import java.util.Arrays;

public class IntermediateOperations {



    public static void main(String[] args) {

        System.out.println();
        showFlatMap1();
        System.out.println();
        showFlatMap2();
        System.out.println();
        showFlatMap3();
        System.out.println();
        showFlatMap4();
        System.out.println();
        showFlatMap5();
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

    private static void showFlatMap3() {

        Stream.of("one two three".split(" "))
            .flatMap(n -> Stream.of(n.split("")))
            .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

    private static void showFlatMap4() {

        Stream.of(1, 2, 3)
            .flatMap(n -> Stream.of(n, n + 1, n + 2))
            .forEach(n -> System.out.print(n + " "));
    }

    private static void showFlatMap5() {

        Stream.of("""
                    This is
                    miltiline string
                    with cariage returns
                    """.split("\n"))
                    .flatMap(x -> Stream.of(x.split(" ")))
                    .forEach(System.out::println);
    }
}


