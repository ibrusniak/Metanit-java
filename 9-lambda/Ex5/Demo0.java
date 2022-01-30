
/**
 * Demonstrates use of lambda expressions
 */
public class Demo0 {

    public static void main(String[] args) {

        Printer printer = obj -> System.out.println(obj);
        printer.print(new Object());
        printer = (o) -> System.out.printf("[%s] %s\n", o.getClass().getName(), o);
        printer.print(new Object());

        try {

            printer = null;
            printer.print(new Object());
        }
        catch (Exception e) {

            (printer = object -> System.out.println(object))
                .print("Couldn't print. Null!");
            printer.print(e.getMessage());
        }

        UnaryCalculator<Integer> sqr = n -> (double)(n * n);
        printer.print(sqr.calculate(2));
        printer.print(sqr.calculate(3));
        printer.print(sqr.calculate(4));

        UnaryCalculator<Double> div = (i) -> (double)(i / 3.33d);
        printer.print(div.calculate(10d));
        printer.print(div.calculate(20d));
        printer.print(div.calculate(333d));
    }
}

interface Printer {
    public void print(Object o);
}

interface UnaryCalculator<T extends Number> {
    public Double calculate(T arg);
}

