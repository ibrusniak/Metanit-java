
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Main.java Work with ArrayList
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        
        Collections.addAll(list1, "foo", "bar", "baz");
        
        ArrayList<String> list2 = new ArrayList<>(150);
        ArrayList<String> list3 = new ArrayList<>(list1);

        List<String> list4;
        list4 = Arrays.asList(new String[]{"first", "second", "third", "four"});

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

        System.out.println();

        Collections.addAll(list2, "1", "2", "3", "4", "5");
        println(list2.size());
        String[] array = new String[]{};
        array = list2.toArray(array);
        for(String s : array)
            System.out.print(s + " ");
        println();

        
    }

    public static void println() {
        System.out.println();
    }

    public static <T> void println(T object) {
        System.out.println(object);
    }
}



