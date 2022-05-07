
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class FlatMapDemo {

    public static void main(String[] args) {

        Stream<String> stream0 = Stream.of("A", "B", "C");
        stream0
            .flatMap(x -> Stream.of(x, "[" + x + " ]", "[" + x + "  ]"))
            .forEach(System.out::println);
        
        System.out.println();
        IntStream.of(1, 3, 5)
            .flatMap(x -> IntStream.of(x, x + 1))
            .forEach(d -> System.out.print(d + " "));
        System.out.println();

        Stream<String> str = Stream.of("hello".split(""));
        str
            .flatMap(x -> Stream.of(x, x, x, x))
            .forEach(d -> System.out.print(d + " "));
        
        System.out.println();
    }
}

