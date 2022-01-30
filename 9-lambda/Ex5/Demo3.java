
public class Demo3 {

    public static void main(String[] args) {

        System.out.println();

        int arg = 23;

        calculate(arg, Operations::sqr);
        calculate(arg, Operations::qube);
    }

    private static <T extends Number> void calculate(T arg, Operation operation) {
        System.out.printf(
            "OP: %s, ARG: %s, RES: %s\n",
            operation,
            arg,
            operation.exec(arg)
        );
    }
}

interface Operation {
    public <T extends Number> Double exec(T arg);
}

class Operations {

    public static <T extends Number> Double sqr(T arg) {
        return arg.doubleValue() * arg.doubleValue();
    }

    public static <T extends Number> Double qube(T arg) {
        return sqr(arg.doubleValue()) * arg.doubleValue();
    }
}

