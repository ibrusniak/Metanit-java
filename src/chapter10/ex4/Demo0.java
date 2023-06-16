package chapter10.ex4;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class Demo0 {

    public static void main(String[] args) {
    
        String[] arr = new String[] {"one", "two", "tree", "four"};
        ArrayList<String> list = new ArrayList<>();
        
        Collections.addAll(list, arr);

        Stream<String> stream1 = list.stream();

        Stream<String> stream2 = Arrays.stream(new String[] {"monday", "tuesday", "wednesday"});

        IntStream stream3 = Arrays.stream(new int[] {2, 5, 2, 7, 2});
        DoubleStream stream4 = Arrays.stream(new double[] {2d, 2.4, 5.0});
        LongStream stream5 = Arrays.stream(new long[] {3l, 2l, 4l});

        Stream<Object> stream6 = Stream.of(new Object(), new Object(), new Object());

        IntStream stream7 = IntStream.of(1, 8, 2, 3);
        
        stream7.forEach(x -> System.out.printf("%d ", x));
        System.out.println();
    }
}