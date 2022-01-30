
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
            e.printStackTrace();
        }
    }
}

interface Printer {
    public void print(Object o);
}

