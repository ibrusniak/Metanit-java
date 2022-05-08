
import java.util.stream.Stream;
import java.util.Optional;

public class TerminalOperationDemo0 {

    public static void main(String[] args) {

        long count = Stream.of(2, 3, 4).count();
        System.out.println(count);

        Optional<Integer> o1 = Stream.of(2, 3, 5).findFirst();
        System.out.println(o1.get());

        Optional<Integer> o2 = Stream.of(2, 3, 5).findAny();
        System.out.println(o2.get());

        System.out.println(Stream.of(2, 2, 2).allMatch(x -> x == 2));
        System.out.println(Stream.of(2, 2, 2).anyMatch(x -> x == 3));
        System.out.println(Stream.of(2, 2, 2).noneMatch(x -> x == 10));

        System.out.println((Stream.of(6, 2, 1, 10).min(Integer::compare)).get());

        Optional<Integer> optionalMax = Stream.of(2, 3, 6, 1, 2).max(Integer::compare);
        int max = optionalMax.get();
        System.out.println(max);
    }
}

