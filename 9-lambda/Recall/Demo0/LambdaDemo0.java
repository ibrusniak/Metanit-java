
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
    }
}

interface FunctionalInterface {
    public void noMatterWhatNameIs();
}


