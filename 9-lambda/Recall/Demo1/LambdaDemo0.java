
public class LambdaDemo0 {

    public static void main(String[] args) {

        Operation<Double, Integer> op1 = n -> Math.sqrt(n);

        printOperationResult(op1, 240);
        printOperationResult(new Operation<Integer, Integer>(){

            public Integer exec(Integer argument) {
                return argument - 200;
            }
        }, 20);

        printOperationResult(n -> n * 3, 230);
    }

    private static <E, V> void printOperationResult(Operation<E, V> op, V argument) {
        System.out.printf("Argument: %s, operation %s, result: %s\n",
            argument, op, op.exec(argument));
    }
}

interface Operation<E, V> {
    public E exec(V argument);
}


