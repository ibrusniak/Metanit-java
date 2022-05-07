
import java.util.stream.Stream;

public class TakeWhileDemo {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(-2, -4, -6, -8, 0, -2, 0, 3, 1, 8);
        stream
            .takeWhile(x -> x < 0)
            .sorted()
            .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
