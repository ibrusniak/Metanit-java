

public class ArithmeticPriorityDemo {

    public static void main(String[] args) {
        
        // Associativity of operations
        // in Java all ops are Left-associative

        System.out.println(100 / 2 * 3); // 100 / 2 = 50; 50 * 3 = 150
        System.out.println(100 / (2 * 3)); // 16, both operands are int

        // Precedence:
        // 1. ++, --
        // 2. *, /, %
        // 3. +, -

        int a = 10;
        int b = 5;

        /**
         *  1. ++b = 6;             b = 6
         *  2. --a = 9;             a = 9;
         *  3. --a * 3;             9 * 3 = 27;
         *  4. --a * 3 / 2;         9 * 3 / 2 = 13;
         *  5. ++b + --a * 3 / 2;   6 + 9 * 3 / 2 = 19;
         */
        System.out.println(++b + --a * 3 / 2); // 19
    }
}
