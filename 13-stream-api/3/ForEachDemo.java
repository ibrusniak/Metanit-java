
//import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.Arrays;

public class ForEachDemo {

    public static void main(String[] args) {

        Integer[] source = new Integer[] { 2, 3, 4 };
        MyClass0<Integer> m = new MyClass0<>();
        Consumer<Integer> c = m::accept;
        Arrays.stream(source)
            .forEach(c);
        System.out.println();
        Arrays.stream(source)
            .forEach(System.out::println);
        Arrays.stream(source)
            .forEach(w -> System.out.printf("\n\n\t%d\n", w));
    }
}

class MyClass0<T> implements Consumer<T> {
    
    public void accept(T arg) {
        System.out.print(arg + " ");
    }
}


