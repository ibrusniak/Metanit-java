
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Consumer;

public class Ex1 {

    public static void main(String[] args) {

        Integer[] source
            = new Integer[] {2, 4, 12, -3, 0, 6, -1, 5, 8, 10, 0};

        List<Integer> list
            = Arrays.asList(source);
        
        Stream<Integer> stream1 = list.stream(); // 1
        Stream<Integer> stream2 = Stream.of(source); // 2
        Stream<Integer> stream3 = Arrays.stream(source); // 3

        stream1.filter(z -> z <= 0).forEach(System.out::println);
        System.out.println();
        System.out.println(stream2.count());
        
        System.out.println();

        Consumer<Integer> print = n -> System.out.print(n + " ");

        Stream.of(source)
            .forEach(print);

        System.out.println();
        
        stream3
            .map(n -> n *= -1)
            .forEach(print);

        System.out.println();
    }
}



