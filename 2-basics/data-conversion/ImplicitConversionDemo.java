
/**
 * ImplicitConversionDemo
 */
public class ImplicitConversionDemo {

    public static void main(String[] args) {
        
        byte byteVariable = 20;
        short shortVariable;
        int intVariable;
        long longVariable;

        float floatVariable;
        double doubleVariable;

        // Explicit (automatic) converion (widering) without
        // any problems:
        // byte -> short -> int -> long
        // int -> double
        // short -> float -> double
        // char -> int
        shortVariable = byteVariable;
        intVariable = shortVariable;
        longVariable = intVariable;

        doubleVariable = intVariable;
        floatVariable = shortVariable;

        prn(intVariable);
        prn(doubleVariable);
        prn(shortVariable);
        prn(floatVariable);

        prn();

        char charVariable = 'F';
        prn(charVariable);
        intVariable = charVariable;
        prn(intVariable); // 70 - is number of 'F' in Unicode table

        prn();

        // Narrowing! Lose precision
        // int -> float
        // long -> float, long -> double
        prn("float max: " + Float.MAX_VALUE);
        intVariable = 340282352;
        floatVariable = intVariable;
        prn(intVariable);
        prn(floatVariable);
    }

    private static <T> void prn(T message) {

        System.out.println(message);
    }
    private static void prn() {

        System.out.println();
    }
}
