
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo1 {

    public static void main(String[] args) {

        Stream<Integer> str0 = Stream.of(2, 3, 4);
        List<Integer> lst0 = str0.collect(Collectors.toList());
        lst0.stream().forEach(System.out::println);
    }
}

