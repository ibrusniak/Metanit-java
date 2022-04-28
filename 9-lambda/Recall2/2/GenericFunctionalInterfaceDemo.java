
public class GenericFunctionalInterfaceDemo {

    public static void main(String[] args) {
        Operation<Integer> op1 = (a, b) -> a + b;
        Operation<String> op2 = (a, b) -> a + b;
        System.out.println(op1.execute(2, 3));
        System.out.println(op2.execute("2", "3"));
    }
}

interface Operation<T> {
    public T execute(T a, T b);
}

