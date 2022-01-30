
public class Demo0 {

    public static void main(String[] args) {
        
        /**
         * Classic syntax. Using anonymous class - implementator
         * of the functional interface. Instead of use lambdas...
         */
        Functional f = new Functional() {

            @Override
            public void doSomething() {
                System.out.println(this);
            }
        };

        f.doSomething();

        callable(f);

        callable(new Functional(){

            @Override
            public void doSomething() {
                System.out.println(this);
            }
        });
    }

    private static void callable(Functional f) {
        f.doSomething();
    }
}

interface Functional {
    public void doSomething();
}

