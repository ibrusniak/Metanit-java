
public class TryLambdaAgain1 {

    public static void main(String[] args) {

        /**
         * Traditional way - use anonymous class
         * that implements interface
         */
        FunctionalInterface1 obj1 = new FunctionalInterface1() {

            @Override
            public int doSmth(int n) {
                return n * 2;
            }
        };
        
        int n = 4;

        System.out.printf("%s %s\n", n, obj1.doSmth(n));

        /**
         * Lambda-function
         */
        FunctionalInterface1 obj2 = (i) -> n * 2;

        int j = 10;

        System.out.printf("%s %s\n", j, obj2.doSmth(j));
    }
}

interface FunctionalInterface1 {

    public int doSmth(int n);
}

