
/**
 * Shows functional interface
 */

public class LambdaDemo0 {

    public static void main(String[] args) {

        FunctionalInterface f1 = () -> System.out.println("1");
        FunctionalInterface f2 = () -> System.out.println("2");

        f1.noMatterWhatNameIs();
        f2.noMatterWhatNameIs();

        f1 = () -> System.out.println("3");
        f1.noMatterWhatNameIs();

        SomeUnaryMathOperation sqrt = n -> Math.sqrt(n);
        System.out.println(sqrt.execute(25d));
    }
}

interface FunctionalInterface {
    public void noMatterWhatNameIs();
}

interface SomeUnaryMathOperation {
    public Double execute(Double argument);
}

