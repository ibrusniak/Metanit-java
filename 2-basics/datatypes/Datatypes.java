
public class Datatypes {

    public static void main(String[] args) {
        
        // Integer data types:
        // byte, short, int, long

        System.out.println("\nInteger types\n");

        Byte byteVariable = 1;

        System.out.printf("byteVariable. Class: %s, \n\tbyteVariable.MIN_VALUE = %d, \n\tbyteVariable.MAX_VALUE = %d, \n\tbyteVariable.BYTES = %d, \n\tbyteVariable.SIZE = %d;\n",
            byteVariable.getClass().getSimpleName(),
            byteVariable.MIN_VALUE,
            byteVariable.MAX_VALUE,
            byteVariable.BYTES,
            byteVariable.SIZE);

        // Error: incompatible types: int cannot be converted to Byte
        // byteVariable = 128;

        // Error: the same error
        // Byte byteVariable2 = (Byte)(128);

        Short shortVariable = 400;

        System.out.printf("shortVariable. Class: %s, \n\tshortVariable.MIN_VALUE = %d, \n\tshortVariable.MAX_VALUE = %d, \n\tshortVariable.BYTES = %d, \n\tshortVariable.SIZE = %d;\n",
            shortVariable.getClass().getSimpleName(),
            shortVariable.MIN_VALUE,
            shortVariable.MAX_VALUE,
            shortVariable.BYTES,
            shortVariable.SIZE);

        Short shortVariable2;

        // Error: incompatible types: Byte cannot be converted to Short
        // shortVariable2 = (Short)byteVariable;

        Integer integerVariable;

        // Error: variable integerVariable might not have been initialized
        // System.out.printf("integerVariable = %d", integerVariable);

        integerVariable = 1;

        System.out.printf("integerVariable. Class %s, \n\tshortVariable.MIN_VALUE = %d, \n\tshortVariable.MAX_VALUE = %d, \n\tshortVariable.BYTES = %d, \n\tshortVariable.SIZE = %d;\n",
            integerVariable.getClass().getSimpleName(),
            integerVariable.MIN_VALUE,
            integerVariable.MAX_VALUE,
            shortVariable.BYTES,
            shortVariable.SIZE);
        
        Long longVariable = 2l;

        System.out.printf("longVariable. Class %s, \n\tlongVariable.MIN_VALUE = %d, \n\tlongVariable.MAX_VALUE = %d, \n\tlongVariable.BYTES = %d, \n\tlongVariable.SIZE = %d;\n",
            longVariable.getClass().getSimpleName(),
            longVariable.MIN_VALUE,
            longVariable.MAX_VALUE,
            longVariable.BYTES,
            longVariable.SIZE);

        System.out.println("\nClass Boolean\n");

        // boolean type
        Boolean
            booleanVariable1,
            booleanVariable2,
            booleanVariable3,
            booleanVariable4;

        booleanVariable1 = true;
        booleanVariable2 = false;
        
        booleanVariable3 = Boolean.TRUE;
        booleanVariable4 = Boolean.FALSE;

        // Error: int cannot be converted to Boolean
        // Boolean booleanVariable3 = 0;

        System.out.printf("Boolean.TRUE == true: %s\n", Boolean.TRUE == true);

        System.out.println("\nFloating point types\n");

        Float floatVariable = 200f;

        System.out.printf("floatVariable. Class %s, \n\tfloatVariable.MIN_VALUE = %s, \n\tfloatVariable.MAX_VALUE = %s, \n\tfloatVariable.BYTES = %d, \n\tfloatVariable.SIZE = %d;\n",
            floatVariable.getClass().getSimpleName(),
            floatVariable.MIN_VALUE,
            floatVariable.MAX_VALUE,
            floatVariable.BYTES,
            floatVariable.SIZE);

        Double doubleVariable = 200d;

        System.out.printf("doubleVariable. Class %s, \n\tdoubleVariable.MIN_VALUE = %s, \n\tdoubleVariable.MAX_VALUE = %s, \n\tdoubleVariable.BYTES = %d, \n\tdoubleVariable.SIZE = %d;\n",
            doubleVariable.getClass().getSimpleName(),
            doubleVariable.MIN_VALUE,
            doubleVariable.MAX_VALUE,
            doubleVariable.BYTES,
            doubleVariable.SIZE);

        System.out.println("\n Class Character (UTF-16)\n");
                
        Character characterVariable = 'a';

        System.out.printf("characterVariable. Class %s, \n\tcharacterVariable.MIN_VALUE = %s, \n\tcharacterVariable.MAX_VALUE = %s, \n\tcharacterVariable.BYTES = %d, \n\tcharacterVariable.SIZE = %d;\n",
            characterVariable.getClass().getSimpleName(),
            characterVariable.MIN_VALUE,
            characterVariable.MAX_VALUE,
            characterVariable.BYTES,
            characterVariable.SIZE);        
    }
}
