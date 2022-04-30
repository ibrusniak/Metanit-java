
import java.util.function.Function;

public class UseFunction {

    public static void main(String[] args) {
        Function<Integer, String> f1 = n -> n.toString();
        System.out.println(f1.apply(200));
        Function<A, B> f2 = a -> new B(a.value().toString());
        A a = new A(300);
        System.out.println(a);
        System.out.println(f2.apply(a));
    }
}

record A (Integer value) {};
record B (String name) {};

