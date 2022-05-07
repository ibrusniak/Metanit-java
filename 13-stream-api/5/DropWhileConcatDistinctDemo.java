
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class DropWhileConcatDistinctDemo {

    public static void main(String[] args) {

        Stream<Integer> ints = Stream.of(7, 2, -1, 0, -3, 5, 3, 9, 0, -7);
        ints
            .dropWhile(x -> x < 9)
            .forEach(x -> System.out.print(x + " "));
        
        System.out.println();

        Stream<String> s1 = Stream.of("1", "2", "3");
        Stream<String> s2 = Stream.of("4", "5", "6");
        Stream.concat(s1, s2)
            .forEach(x -> System.out.print(x + " "));

        System.out.println();

        IntStream.of(6, 2, 8, 8, 6, 2, 2, 2, 2, 6)
            .distinct()
            .forEach(x -> System.out.print(x + " "));
        
        System.out.println();
    }
}

