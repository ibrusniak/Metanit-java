
/**
 * StringTest1. Demonstrates use of some functions
 * from class "String" like 'trim' etc.
 */
public class StringTest1 {
    
    public static void main(String[] args) {
        
        String stringVariable1 = "  This is normal string with some extra spaces    ";
        String stringVariable2 = """
                                This is multi line
                                string. It usually names
                                    \"text block\"
                                """;
        prn(stringVariable1);
        prn(stringVariable2);

        char[] characterArray = { 'N', 'e', 'y', ' ', 'Y', 'e', 'a', 'r' };
        // characterArray must be char[], not Character[]
        String stringVariable3 = new String(characterArray);
        prn(stringVariable3);

        
    }

    private static void prn(Object o) {

        System.out.println(o);
    }

}


