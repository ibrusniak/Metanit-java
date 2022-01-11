
import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("one");
        list1.add("two");
        list1.add("three");
        System.out.println(list1);
        list1.add("four");
        System.out.println(list1);
        list1.add(0, "zero");
        System.out.println(list1);
        list1.set(1, "_one");
        System.out.println(list1);
        System.out.println("index of \"hundred\": " +
            list1.indexOf("hundred"));
        
        String s = list1.remove(0);
        System.out.println("s = " + s);
        System.out.println(list1);
    }
}


