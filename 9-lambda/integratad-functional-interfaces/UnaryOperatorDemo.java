
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    public static void main(String[] args) {

        System.out.println(factorial(5)); // test

        UnaryOperator<Integer> operator
            = n -> factorial(n);

        System.out.println(operator.apply(5));

        operator = n -> sqr(n);

        System.out.println(operator.apply(5));

        operator = n -> n * sqr(n); // qube

        System.out.println(operator.apply(5));
    }

    private static int factorial(int base) {

        int counter = 0;
        int result = 1;

        while (++counter <= base)
            result *= counter;

        return result;
    }

    private static int sqr(int base) {

        return base * base;
    }
}

