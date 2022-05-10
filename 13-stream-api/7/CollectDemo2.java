
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class CollectDemo2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        Stream<String> stream = list.stream();
        stream.forEach(x -> System.out.print(x + " "));
        System.out.println();
        stream = list.stream();
        
        List<String> list2 = stream.collect(Collectors.toList());
        Iterator<String> iterator = list2.iterator();
        String s = "";
        while(iterator.hasNext()) {
            s = s + iterator.next() + " ";
        }
        System.out.println(s);
    }
}

