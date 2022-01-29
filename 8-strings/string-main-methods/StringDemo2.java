import java.util.ArrayList;
import java.util.Iterator;

public class StringDemo2 {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("");
        strings.add(new String());
        strings.add("test");

        doSomeTest(strings);
        doSomeTest();
    }

    private static void printf(String format, Object... args) {
        System.out.printf(format + "\n", args);
    }

    private static void doSomeTest(ArrayList<String> strings) {

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {

            String string = iterator.next();
            System.out.printf("\"%s\".isEmpty(): %s\n", string, string.isEmpty());
            System.out.printf("\"%s\" == null: %s\n", string, strings == null);
        }

        System.out.println();
    }

    private static void doSomeTest() {

        String s1 = "foo";
        String s2 = " ";
        String s3 = "bar";
        String s4 = "baz";

        printf("concat [%s] and [%s] and [%s]: [%s]",
            s1, s2, s3,  s1.concat(s2).concat(s3));

        printf("charAt(2) of [%s]: \'%s\'", s3, s3.charAt(2));

        printf("%s", String.join(" ", s1, s3, s4));
    }
}
