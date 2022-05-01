
import java.util.stream.*;

public class Ex0 {

    public static void main(String[] args) {
        int[] array
            = new int[] { 1, -2, 7, 0, -6, 3, 5, 2, 0, -8 };
        // Find count of the numbers, grater than zero
        // Classic method:
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                count1++;
        }
        System.out.println("1. count = " + count1);
        long count2 = IntStream.of(array).filter(a -> a > 0).count();
        System.out.println("2. count = " + count2);
    }
}


