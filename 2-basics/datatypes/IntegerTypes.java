
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
        printVariableInfo(200);
        printVariableInfo(200l);
        printVariableInfo(Byte.parseByte("127"));

        // This one does not work. Error: int cannot be converted to Byte
        // printVariableInfo((Byte)110);

        // but this works properly!..
        printVariableInfo((byte)120); // 120

        printVariableInfo((byte)127); // 127
        printVariableInfo((byte)128); // -128 bit grid overflow
        printVariableInfo((byte)129); // -127

        printVariableInfo((byte)(128 + 128)); // 0

        // 0. Double bit grid overflow
        printVariableInfo((int)((Integer.MAX_VALUE + 1) + (Integer.MAX_VALUE + 1)));

        Byte byteVariable2 = 0xF;           // Hexadecimal representation
        printVariableInfo(byteVariable2);

        System.out.println();

        // HEX
        printVariableInfo(0x9);
        printVariableInfo(0xA);
        printVariableInfo(0xB);
        // ...
        printVariableInfo(0xF);

        System.out.println();

        // BIN
        printVariableInfo(0b01);
        printVariableInfo(0b10);
        printVariableInfo(0b11);

        System.out.println();

        // OCT
        printVariableInfo(001);
        printVariableInfo(010);
        printVariableInfo(011);

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

        System.out.printf("Class: %s, value: %s\n", n.getClass().getSimpleName(), n);
    }
}

