

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.Comparator;

public class SortedDemo {

    public static void main(String[] args) {

        List<String> phones = new ArrayList<>();

        Collections.addAll(phones, "iPhone X", "Nokia 9", "Hawei Nexus 6P",
            "Samsung Galaxy S8", "LG G6", "Xiaomi MI6",
            "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2");
            
        phones.stream()
            .filter(p -> p.length() < 12)
            .sorted()
            .forEach(System.out::println);
        
        System.out.println();
        Arrays.stream(new Integer[]{6, -2, 9, 0, 2, 4, 1, -7})
            .sorted()
            .forEach(x -> System.out.print(x + " "));
        System.out.println();

        Stream<String> st = Stream.of("A", "B", "BB", "AAA", "D", "DD");
        st
            .sorted((a, b) -> {
                if (a.length() == b.length()) return 0;
                else if (a.length() > b.length()) return 1;
                else
                return -1;
            })
            .forEach(System.out::println);
    }
}
