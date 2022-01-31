
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Arrays;
import java.util.function.Predicate;

class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> positive = n -> n > 0;
        Predicate<Integer> negative = n -> n < 0;
        Predicate<Integer> isZero = n -> n == 0;

        ArrayList<Predicate<Integer>> list = new ArrayList<>(5);

        list.add(positive);
        list.add(negative);
        list.add(isZero);

        Iterator<Predicate<Integer>> predicateIterator = list.iterator();

        List<Integer> ints =
            Arrays.asList(2, -3, 0);

        Iterator<Integer> intsIterator = ints.iterator();

        System.out.println();

        while (predicateIterator.hasNext()) {

            Predicate<Integer> p = predicateIterator.next();

            while (intsIterator.hasNext()) {

                Integer i = intsIterator.next();
                System.out.printf("predicate: [%s], argument: [%s], result: [%s]\n",
                p, i, p.test(i));
            }

            System.out.println();
            intsIterator = ints.iterator();
        }
    }
}

