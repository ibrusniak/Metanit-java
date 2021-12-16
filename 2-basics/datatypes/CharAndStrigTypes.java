
/**
 * CharAndStrigTypes - demonstrates use of Character and String
 * variables use
 */
public class CharAndStrigTypes {

    public static void main(String[] args) {
        
        char characterVariable1 =  'G';
        Character characterVariable2 = 'F';

        printSimpleName(characterVariable1);    // Character
        printSimpleName(characterVariable2);    // Character

        char characterVariable3 = 120; // 'x'
        prn(characterVariable3);

        Character characterVariable4 = '\u0078'; // 'x'. Unicode notation. HEX 78 = DEC 120
        prn(characterVariable4);
        // prn(Integer.toHexString(120));

        prn('\u0021'); // !

        // There is no 'primitive' variant of String
        // type in Java, so we can not write something like this:
        // string stringVariable1 = "hello..."; // Error: can not fynd symbol ("string")

        String stringVariable2 = "Hi\nfriends!";
        prn(stringVariable2);

        // Text blocks are available from Java 15
        String textBlockVariable1 = """
                                    This is text block.
                                    We do not need to use any ESC-sequence to insert
                                    'line feed' into text... Text will be used 'as is'
                                    """;

        prn(textBlockVariable1);

        Integer integerVariable = 5590;

        String informationAboutVariable =
        String.format(  """
                        Decimal representation is:      %d,
                        Hexadecimal representation is:  %s,
                        Octal representation is:        %s,
                        Binary representation is:       %s\n
                        Escape sequense \n works inside the text block !
                        """,
                        integerVariable,
                        Integer.toHexString(integerVariable),
                        Integer.toOctalString(integerVariable),
                        Integer.toBinaryString(integerVariable));

        prn(informationAboutVariable);
    }

    private static void prn(Object o) {

        System.out.println(o);
    }

    private static void printSimpleName(Object o) {
        
        System.out.println(o.getClass().getSimpleName());
    }
}

