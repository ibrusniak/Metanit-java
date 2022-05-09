
import java.util.stream.*;
import java.util.function.*;
import java.util.Optional;

public class ReduceDemo {

    public static void main(String[] args) {

        Optional opSum = Stream.of(2, 3, 4).reduce((x, y) -> x + y);
        System.out.println(opSum.get());
        Optional opMul = Stream.of(1, 2, 3, 4, 5).reduce((x, y) -> x * y); // factorial(5) =  120;
        System.out.println(opMul.get());
        Optional<String> opSum2 = Stream.of("foo", "bar", "baz").reduce((a, b) -> a + " " + b);
        System.out.printf("\n[%s]\n", opSum2.get());

        int result = IntStream.of(2, 3, 4).reduce(2, (x, y) -> x * y); // 2 * 2 * 3 * 4
        System.out.println(result);
    }
}

