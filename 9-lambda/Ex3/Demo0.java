/**
 * Demo0 - demostrates how to use lambdas as method arguments
 */
public class Demo0 {

    public static void main(String[] args) {
        
        Functiona0<Integer, Integer> square = (n) -> n * n;
        Functiona0<Integer, Integer> qube = (n) -> square.calculate(n) * n;

        callable(200, square);
        callable(200, qube);
        callable(2, (n) -> n - 200);
        callable(4, (n) -> n * 2);
    }

    private static <T, V> void callable(V arg, Functiona0<T, V> f) {

        System.out.println(f.calculate(arg));
    }
}

interface Functiona0<E, V> {
    public E calculate(V arg);
}


