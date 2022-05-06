
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class Ex0 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");

        Stream stream1 = list.stream();

        IntStream.of(20, 30, 60, -2, 0, 333, -20, 0 , 6, 2)
            .filter(x -> x > -500)
            .map(x -> x * 3)
            .limit(2)
            .forEach(x -> System.out.printf(x + " "));

        System.out.println();

        Stream stream2 = Stream.empty();
        Stream stream3 = new ArrayList<String>(2).stream();
        Stream stream4 = new HashMap<String, Integer>(20).entrySet().stream();
        Stream<Integer> stream5 = Arrays.stream(new Integer[] {2, 1, 0, 4});
        Stream<Boolean> stream6 = Stream.of(true, false, true, true);
    }
}

