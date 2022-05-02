
import java.util.stream.*;
import java.util.ArrayList;

public class Ex1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(200);
        list.add(100);
        list.add(20);
        Stream<Integer> s = list.stream();
        System.out.println(s);
        System.out.println(s.count());
        s = list.stream(); // "reopen" stream
        System.out.println(s.filter(n -> n == 200).count());
    }
}


