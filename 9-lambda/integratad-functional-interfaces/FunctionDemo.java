
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<Integer, Integer> function = n -> n / 2;

        System.out.println(function.apply(20));

        // this is method call - "someMathFuncs.factorial(...)"
        // this is method ref - "someMathFuncs::factorial"
        function = someMathFuncs::factorial;

        System.out.println(function.apply(5));
    }
}

class someMathFuncs {

    public static int factorial(int n) {

        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}

