
import java.util.function.Predicate;

public class PredicateDemo1 {

    public static void main(String[] args) {

        Predicate<String> stringTester = String::isEmpty;

        System.out.println(stringTester.test(""));
        System.out.println(stringTester.test("foo"));

        Predicate<Integer> isNull = n -> n == null;

        System.out.println(isNull.test(20));
        System.out.println(isNull.test(0));
        System.out.println(isNull.test(null));

        // Classic syntax
        Predicate<String> stringTester2 = new Predicate<>() {

            public boolean test(String t) {
                return t.length() > 10;
            }
        };

        System.out.println(stringTester2.test("bar"));
    }
}


