
import java.util.List;
import java.util.ArrayList;

import java.util.stream.Stream;
import java.util.stream.IntStream;

import java.util.Arrays;

import java.util.function.Function;
import java.util.function.Consumer;

import java.util.concurrent.atomic.AtomicInteger;

public class CreateStream {

    public static void main(String[] args) {

        new CreateFromList();
        System.out.println();        
        new CreateFromArray();
        System.out.println();        
        new CreateWithStreamOf();
        System.out.println();        
        new CreateWithStreamBuilder();
        System.out.println();
        new CreateWithRange();
        System.out.println();
        new CreateWithGenerator();
        System.out.println();
        new CreateWithIterator();
    }
}

class CreateFromList {

    public CreateFromList() {
        
        List<String> cities = new ArrayList<>();

        cities.add("London");
        cities.add("Berlin");
        cities.add("Tallin");
        cities.add("Paris");

        Stream<String> citiesStream = cities.stream();

        citiesStream
            .map(s -> s.toUpperCase())
            .forEach(s -> System.out.println(s + " "));
    }
}

class CreateFromArray {

    public CreateFromArray() {

        String[] names
            = new String[] {"jack", "lili", "mIchael", "rUDGER", "Bishop" };

        Stream<String> streamNames = Arrays.stream(names);

        streamNames
            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
            .forEach(System.out::println);
    }
}

class CreateWithStreamOf {

    public CreateWithStreamOf() {

        Function<String, String> toUpperCaser = s -> s.toUpperCase();
        Consumer<String> printer = System.out::println;

        Stream<String> fbb = Stream.of("foo", "bar", "baz");
        fbb
            .map(toUpperCaser)
            .forEach(printer);
    }
}

class CreateWithStreamBuilder {

    public CreateWithStreamBuilder() {

        Stream.Builder<String> builder
            = Stream.builder();

        Stream<String> productLines
            = builder
                .add("Cars")
                .add("Toys")
                .add("Pets")
                .add("Meals")
                .build();
        
        productLines.forEach(System.out::println);
    }
}

class CreateWithRange {

    public CreateWithRange() {

        IntStream ints = IntStream.range(20, 40);
        ints
            .filter(x -> x % 2 == 0)
            .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}

class CreateWithGenerator {

    public CreateWithGenerator() {

        AtomicInteger init = new AtomicInteger(0);
        Stream<Integer> s =
            Stream.generate(init::getAndIncrement);

        s
            .limit(20)
            .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}

class CreateWithIterator {

    public CreateWithIterator() {

        Stream<Integer> s = Stream.iterate(0, i -> i + 1);
        
        s
            .limit(10)
            .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}

