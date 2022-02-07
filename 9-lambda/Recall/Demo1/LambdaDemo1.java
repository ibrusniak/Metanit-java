
public class LambdaDemo1 {

    public static void main(String[] args) {

        System.out.println(getOp("addition").exec(200, 300));
        System.out.println(getOp("substration").exec(200, 100));
        System.out.println(getOp("multiplication").exec(20, 4));
        System.out.println(getOp("foo").exec(20, 4));
    }

    private static SomeUnaryOperation getOp(String opName) {

        switch (opName) {
            case "multiplication": return (n, m) -> n * m;
            case "division": return (n, m) -> n / m;
            case "substration": return (n, m) -> n - m;
            case "addition": return (n, m) -> n + m;
            default: return (n, m) -> 0;
        }
    }
}

interface SomeUnaryOperation {
    public int exec(int a, int b);
}

