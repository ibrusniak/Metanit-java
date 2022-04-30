
import java.util.function.BinaryOperator;
import java.util.ArrayList;
import java.util.Iterator;

public class UseBinaryOperator {

    public static void main(String[] args) {
        ArrayList<BinaryOperator<Integer>> list
            = new ArrayList<>();
        list.add((n, m) -> n & m);
        list.add((n, m) -> n | m);
        list.add((n, m) -> n >> m);
        Iterator<BinaryOperator<Integer>> iterator
            = list.iterator();
        while (iterator.hasNext()) {
            int result = iterator.next().apply(20, 30);
            System.out.println(result);
        }        
    }
}

