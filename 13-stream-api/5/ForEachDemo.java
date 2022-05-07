
import java.util.stream.Stream;

public class ForEachDemo {

    public static void main(String[] args) {
        Stream<String> cities = Stream.of("London", "Kyiv", "Moscow", "Washington");
        cities.forEach(System.out::println);
        Stream.of(2, 4, 5).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}

