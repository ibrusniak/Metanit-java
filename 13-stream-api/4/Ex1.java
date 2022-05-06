
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        String[] array = { "Hello", "World" };
        
        Arrays.stream(array)
            .forEach(System.out::println);

        System.out.println();

        Arrays.stream(array)
            .map(s -> s.split(""))
            .flatMap(a -> Arrays.stream(a))
            .distinct()
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }
}

