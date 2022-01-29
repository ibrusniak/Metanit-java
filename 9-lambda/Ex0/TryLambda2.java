
public class TryLambda2 {

    public static void main(String[] args) {

        Printer printer = (object) -> System.out.println(object);

        printer.work(new Object());
        printer.work(new String("foo/bar/baz"));
        printer.work(233.444e4d);

        printer = (object) -> System.out.printf("\n\n[%s]\n\n", object);

        printer.work(new Object());
        printer.work("foo/bar/baz");
        printer.work(223f);
    }
}

interface Printer {
    public void work(Object o);
}

