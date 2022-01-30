
import java.util.function.Consumer;

public class Demo4 {

    public static void main(String[] args) {

        Consumer<Object> printer = obj -> System.out.println(obj);

        try {

            printer.accept(getOperation(4).exec(4d, 5d));
            printer.accept(getOperation(2).exec(4d, 5d));
            printer.accept(getOperation(3).exec(4d, 5d));
            printer.accept(getOperation(1).exec(4d, 5d));
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    private static Operation getOperation(int operationNumber) throws Exception {

        switch (operationNumber) {

            case 1:
                return (n, m) -> n + m;
            case 2:
                return (n, m) -> n - m;
            case 3:
                return (n, m) -> n * m;
            case 4:
                return (n, m) -> n / m;
            default:
                throw new Exception("Unsupported operatin!");
        }
    }
}

interface Operation {
    public Double exec(Double operand1, Double operand2);
}


