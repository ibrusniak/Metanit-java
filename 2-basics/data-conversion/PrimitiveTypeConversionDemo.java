

public class PrimitiveTypeConversionDemo {

    public static void main(String[] args) {
        
        int intVariable   = 2;
        byte byteVariable  = 3;
        short shortVariable = 6;
        long longVariable  = 2;

        printTypeInfo(intVariable);
        printTypeInfo(byteVariable);
        printTypeInfo(shortVariable);
        printTypeInfo(longVariable);

        final int maxByteValue = ((Byte)byteVariable).MAX_VALUE; // static field
        prn(maxByteValue);

        pirntEmptyLine();

        intVariable = 10;
        //byteVariable = intVariable; // cannot convert from int to byte
        byteVariable = (byte)intVariable;
        prn(byteVariable);
        intVariable = 128;
        byteVariable = (byte)intVariable;
        prn(byteVariable);
        byteVariable = (byte)129; // -127
        prn(byteVariable);
    }

    public static <T> void printTypeInfo(T object) {
        
        System.out.println(object.getClass().getSimpleName());
    }

    public static void pirntEmptyLine() {
        
        System.out.println();
    }

    public static <T> void prn(T object) {
        
        System.out.println(object);
    }
}