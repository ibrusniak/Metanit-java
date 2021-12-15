
/**
 * IntegerTypeOps - demonstrates work with some functions from wrap-classes
 * Byte, Short, Integer, Long
 */
public class IntegerTypeOps {

    public static void main(String[] args) {
        
        Byte
            byteVariable1 = 15,
            byteVariable2 = 16,
            byteVariable3 = 16;

        prn(Byte.compare(byteVariable1, byteVariable2));
        prn(Byte.compare(byteVariable2, byteVariable3));
        prn(Byte.compare(byteVariable2, byteVariable1));

        var someVariable = byteVariable1.byteValue();
        printVariableInfo(someVariable);

        Integer integerVariable = 128;
        Byte byteVariable4 = integerVariable.byteValue();
        printVariableInfo(byteVariable4); // -128
        printVariableInfo(integerVariable.doubleValue());

        Integer integerVariable2 = 100;
        prn(integerVariable2);
        prn(Integer.toBinaryString(integerVariable2));
        Integer reversedIntegerVariable = Integer.reverse(integerVariable2);
        prn(reversedIntegerVariable);
        prn(Integer.toBinaryString(reversedIntegerVariable));

        prn(Integer.toBinaryString(5));
        prn(Integer.toBinaryString(Integer.reverse(5)));

        // 8 = 00000000000000000000000000001000
        prn(Integer.toBinaryString(8));
        // reversed 8 = 00010000000000000000000000000000
        prn(Integer.toBinaryString(Integer.reverse(8)));
    }

    private static void prn(Number n) {

        System.out.println(n);
    }

    private static void prn(String s) {

        System.out.println(s);
    }

    private static void printVariableInfo(Number n) {

        System.out.printf("Class: %s, value: %s\n", n.getClass().getSimpleName(), n);
    }
}

