
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

public class OptionalDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.get());
        numbers.clear();
        min = numbers.stream().min(Integer::compare);
        try {
            System.out.println(min.get()); // Exception: no value present
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(min.isPresent()); // false
    }
}


