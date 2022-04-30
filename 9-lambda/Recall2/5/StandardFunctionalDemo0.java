
import java.util.function.Predicate;

public class StandardFunctionalDemo0 {

    public static void main(String[] args) {
        Predicate<String> predicate0 = n -> n == "";
        Predicate<Integer> predicate1 = n -> n > 0;
        System.out.println(predicate0.test("hi"));
        System.out.println(predicate1.test(2));
        Predicate<Integer> falsePredicat = n -> false;
        System.out.println(falsePredicat.test(20));
        System.out.println(falsePredicat.test(10));
    }
}

