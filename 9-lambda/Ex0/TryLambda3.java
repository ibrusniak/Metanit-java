
public class TryLambda3 {

    public static void main(String[] args) {

        Printable printer = (obj) -> System.out.println(obj);
        Interface1 l1 = () -> printer.print(Runtime.getRuntime().freeMemory());

        l1.showSystemInfo();

        l1 = () -> printer.print("Hello bla bla bla");

        l1.showSystemInfo();
        
        l1 = () -> printer.print(Runtime.getRuntime().version());

        l1.showSystemInfo();
    }
}

interface Interface1 {
    public void showSystemInfo();
}

interface Printable {
    public void print(Object o);
}

