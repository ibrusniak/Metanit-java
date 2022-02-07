
import java.util.ArrayList;
import java.util.Iterator;

public class LambdaDemo1 {

    public static void main(String[] args) {

        ArrayList<MathUnaryOp<Integer>> ops = new ArrayList<>();

        ops.add(n -> n * n);
        ops.add(n -> n * n * n);
        ops.add(n -> n / 3);
        ops.add(n -> --n);

        Iterator<MathUnaryOp<Integer>> it = ops.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next().exec(200));
        }
    }
}

interface MathUnaryOp<E> {
    public E exec(E argument);
}

