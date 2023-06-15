package chapter10.example1;

import static util.Console.*;

import java.util.stream.IntStream;

public class Main {
    
    public static void main(String[] args) {

        int[] array = new int[] {-2, -6, 9, 2, 1, 0, 5, -11}; // 4
        println(positiveCount(array));
        IntStream stream = IntStream.of(array);
        long count = stream.filter(x -> x > 0).count();
        println(count);
    }

    private static int positiveCount(int[] array) {
        
        int res = 0;
        for (int i : array)
            if (i > 0) res++;
        return res;
    }
}