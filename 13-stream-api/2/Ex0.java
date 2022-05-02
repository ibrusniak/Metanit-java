
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.*;

public class Ex0 {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Paris", "London", "Madrid");

        // 1. creates the stream from Collection
        cities.stream()
            .filter(s -> s.length() == 6)
            .forEach(s -> System.out.println(s));

        System.out.println();

        Stream<String> stream = cities.stream();
        stream = stream.filter(w -> w.length() == 5);
        stream.forEach(q -> System.out.println(q));

        int[] array = new int[] { 3, 7, 3, 1, 6, 3, 5, 0, 2, 4 };
        // 2. creates the stream with Arrays.stream(T[] array)
        IntStream intStream = Arrays.stream(array);
        intStream.forEach(f -> System.out.print(f + " "));
        System.out.println();
        intStream = Arrays.stream(array);
        System.out.println(intStream.max());

        // 3. creates the stream with static method Stream.of(T... values)
        Stream<Character> ch = Stream.of('S', 't', 'r', 'e', 'a', 'm', 's');
        ch.forEach(c -> System.out.print(c));
        System.out.println();
    }
}

