
import java.util.function.Function;

public class WaitDemo {

    public static void main(String[] args) {

        Function<String, Integer> cons = (n) -> n.length();
        System.out.println(cons.apply("hello"));
    }
}



