
/**
 * ArithmeticOperators
 */
public class ArithmeticOperators {

    public static void main(String[] args) {
        
        // + - additive operator (or String concatenation)
        // - - substration operator
        // * - multiplication operator
        // / - division operator
        // % - reminder operator

        String str1 = "First string.";
        String lineFeed = "\n";
        String str2 = "Second string.";

        String concatenatedString =
            str1 + lineFeed + str2;

        prn(concatenatedString);
  
        int a = 7;
        int b = 3;
        
        prn(a + b);
        prn(a - b);
        prn(a * b);
        prn(a / b);
        prn(a % b);

        emptyLine();

        prn(11 / 2); // 5
        float f = 11 / 2;
        prn(f); // 5.0 ! not 5.5
        prn(11.0 / 2); // 5.5
        prn(11 / 2.0); // 5.5
        prn(11f / 2); // 5.5
  }

    public static <Q> void prn(Q message) {
        
        System.out.println(message);
    }

    public static void emptyLine() {
        
        System.out.println();
    }
}

