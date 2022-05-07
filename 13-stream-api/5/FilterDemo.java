
import java.util.stream.Stream;
import java.util.Arrays;

public class FilterDemo {

    public static void main(String[] args) {
        Stream<Integer> intStream
            = Arrays.stream(new Integer[] {-9, 3, 0, 1, -2, 6, 4});
        intStream
            .filter(x -> x <= 0)
            .forEach(System.out::println);
    }
}
