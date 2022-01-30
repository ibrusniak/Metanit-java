
public class Demo1 {

    public static void main(String[] args) {

        /**
         * Use lambdas
         */
        
        // Lambda function has now access to "this"
        //FunctionalTwo f = () -> System.out.println(this);

        FunctionalTwo f = () -> System.out.println("Hello lambda 1");
        callable(f);
        f = () -> System.out.println("Hello lambda 2");
        callable(f);

        callable(() -> System.out.println("Hello lambda 3"));
    }

    private static void callable(FunctionalTwo f) {
        f.doSomething();
    }    
}

interface FunctionalTwo {
    public void doSomething();
}
