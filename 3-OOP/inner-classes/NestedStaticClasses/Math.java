
public class Math {

    public static class Factorial {

        private int result;
        private int key;

        public Factorial(int result, int key) {

            this.result = result;
            this.key = key;
        }

        public int getKey() {
            return key;
        }

        public int getResult() {
            return result;
        }

        public void printInfo() {
            System.out.printf("Factorial [%s] is [%s]\n",
                key, result);
        }
    }

    public static Factorial getFactorial(int key) {

        int result = 1;
        for (int i = 1; i <= key; i++) {
            result *= i;
        }
        return new Factorial(result, key);
    }
}
