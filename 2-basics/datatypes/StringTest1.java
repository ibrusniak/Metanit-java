
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

        String fullString = new String("  \tThis is a full string with few extra spaces\t    ");
        prn("[" + fullString + "]");
        prn("[" + fullString.trim() + "]");
        prn("[" + fullString.trim().substring(10, 14) + "]");
        prn(fullString.trim().toLowerCase());
        prn(fullString.trim().toUpperCase());
        prn("[" + fullString.stripTrailing() + "]");
        prn("[" + fullString.stripLeading() + "]");

        String sourceString = "This is a full string with few extra spaces 12";
        String[] matched = sourceString.split("a"); // any symbol

        for(int i = 0; i < matched.length; i++) System.out.print(matched[i] + ":");
        System.out.println();

        String stringVariable =
            "This is int: _int and this is float: _float".replaceAll("_int", "200")
                .replaceAll("_float", "10.2f");

        prn(stringVariable);
    }

    private static void prn(Object o) {

        System.out.println(o);
    }
}


