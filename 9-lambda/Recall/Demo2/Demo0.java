
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;

public class Demo0 {

    public static void main(String[] args) {

        Consumer<Object> printer = MyPrinter::println;
        printer.accept("test");
        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isZero = n -> n == 0;
        Consumer<IntHolder> consumer = c -> c.setInt(c.getInt() * 100);
        IntHolder intHolder = new IntHolder(22);
        printer.accept(intHolder.getInt());
        consumer.accept(intHolder);
        printer.accept(intHolder.getInt());
        Supplier<Object> supplier = () -> new Object();
        printer.accept(supplier.get());
        printer.accept(supplier.get());
        printer.accept(supplier.get());
        Function<Integer, Integer> f = n -> n * 2;
        printer.accept(f.apply(20));
        f = n -> n * 3;
        printer.accept(f.apply(20));
    }
}

class MyPrinter {

    public static void println(Object o) {
        System.out.println(o);
    }
}

class IntHolder {

    private int i;

    public IntHolder(int i) {
        this.i = i;
    }

    public void setInt(int i) {
        this.i = i;
    }

    public int getInt() {
        return this.i;
    }
}

