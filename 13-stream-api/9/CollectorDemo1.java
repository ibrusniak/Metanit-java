
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.Iterator;
import java.util.Comparator;

import java.util.stream.Collectors;

public class CollectorDemo1 {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        Collections.addAll(ints, -2, -6, 3, 8, 0, -2, 0, 5, 4, 7);
        
        Comparator<Integer> comparator = (a, b) -> {
            int result = 0;
            if (a > b) result = 1;
            else if (a < b) result = -1;
            return result;
        };

        Set intSet = ints.stream()
            .collect(Collectors.toSet());

        Iterator<Integer> iterator = ints.iterator();

        System.out.println();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}


