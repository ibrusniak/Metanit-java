
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        Collections.addAll(intList, 1, 3, 4, 2, 4);
        
        List<Integer> intList2 = intList.stream().collect(Collectors.toList());
        for(Integer i : intList2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

