
import java.util.stream.Stream;

public class SkipLimitDemo {
    
    public static void main(String[] args) {
        
        Stream.of(2, 3, 4, 6)
            .limit(2)
            .forEach(System.out::println);
        
        System.out.println();

        Stream.of(2, 3, 4, 4, 6)
            .skip(2)
            .forEach(System.out::println);
    }
}

