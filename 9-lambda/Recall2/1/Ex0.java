
public class Ex0 {

    public static void main(String[] args) {

        Operationable op1 = (a, b) -> a * b;
        System.out.println(op1.execute(20, 3));
        op1 = (a, b) -> a - b;
        System.out.println(op1.execute(20, 3));
        op1 = (a, b) -> a + b;
        System.out.println(op1.execute(20, 3));
    }
}

interface Operationable {
    public int execute(int x, int y);
}


