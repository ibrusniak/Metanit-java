package chapter3.generics.example6;

import static util.Console.*;

public class Main {
    public static void main(String[] main) {
        Parametrized<Integer> p1 = new Parametrized<Integer>(20);
        Parametrized<Float> p2 = new Parametrized<Float>(3.2F);
        Parametrized<Double> p3 = new Parametrized<Double>(5.2);
        println(sum(p1, p2));
        println(sum(p1, p3));
        println(sum(p2, p3));
    }
    private static Parametrized<Double> sum(Parametrized<?> operandA, Parametrized<?> operandB) {
        return
            new Parametrized<Double>(operandA.getValue().doubleValue()
                + operandB.getValue().doubleValue());
    }
}