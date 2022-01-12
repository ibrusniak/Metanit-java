
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

    }
}




