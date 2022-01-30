
import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {

    public static void main(String[] args) {

        ArrayList<MathOperation> ops = new ArrayList<>(4);

        MathOperation<Double, Double> op = (n, m) -> n + m;
        ops.add(op);
        op = (n, m) -> n - m;
        ops.add(op);
        op = (n, m) -> n / m;
        ops.add(op);
        op = (n, m) -> n * m;
        ops.add(op);

        Iterator<MathOperation> iterator = ops.iterator();

        while(iterator.hasNext()) {
            System.out.println((iterator.next()).execute(400d, 300d));
        }
    }
}

interface MathOperation<T extends Number, V extends Number> {
    public Double execute(T operand1, V operand2);
}

