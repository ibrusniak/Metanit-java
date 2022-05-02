
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex2 {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(-1);
        Stream<Integer> s = l.stream();
        prn(s);
        prn(s.isParallel());
        Iterator<Integer> iterator = s.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        Stream<Integer> p = s.parallel();
        prn(p);
        s = l.stream();
        Stream<Integer> seq = s.sequential();
        iterator = seq.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }

    private static <T> void prn(T t) {
        System.out.println(t);
    }
}


