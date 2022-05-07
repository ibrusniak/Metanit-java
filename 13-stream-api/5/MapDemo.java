
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MapDemo {

    public static void main(String[] args) {
        Consumer<Object> printer = x -> System.out.print(x + " ");
        Stream<Integer> stream =
            Stream.of(20, 30, 2, -3, 22, 6, 7);
        stream
            .map(x -> x * 3)
            .forEach(printer);
        System.out.println();
        System.out.println();
        Stream.of(2, 3, 4, 6)
            .mapToDouble(x -> x.doubleValue())
            .forEach(System.out::println);
        
    }
}
