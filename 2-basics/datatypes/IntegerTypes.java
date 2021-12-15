
/**
 * IntegerTypes - demonstrates work with integer types (byte, short, int, long)
 * and convertion from one types to other and vice versa. Demonstrates some
 * common method from wrap-classes (Byte, Short, Integer, Long).
 */
public class IntegerTypes {

    public static void main(String[] args) {
        
        Byte byteVariable = 1;
        Short shortVariable = 2;
        Integer integerVariable = 3;
        Long longVariable = 4l;
        
        System.out.println(getFormattedInformation(byteVariable, shortVariable, integerVariable, longVariable));

        byteVariable = 2_2;     // it works
        shortVariable = 3__3;   // it is too

        System.out.println(getFormattedInformation(byteVariable, shortVariable, integerVariable, longVariable));

        Integer integerVariable2 = Byte.toUnsignedInt(byteVariable);

        printVariableInfo(integerVariable2);
    }

    private static String getFormattedInformation(Byte b, Short s, Integer i, Long l) {

        return
            String.format(
                "%s variable. Value: %d\n" +
                "%s variable. Value: %d\n" +
                "%s variable. Value: %d\n" +
                "%s variable. Value: %d\n",
                b.getClass().getSimpleName(), b,
                s.getClass().getSimpleName(), s,
                i.getClass().getSimpleName(), i,
                l.getClass().getSimpleName(), l
            );
    }

    private static void printVariableInfo(Number n) {

        System.out.printf("Class: %s, value: %s", n.getClass().getSimpleName(), n);
    }
}

