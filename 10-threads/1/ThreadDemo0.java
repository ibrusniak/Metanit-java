
import java.util.function.Consumer;

public class ThreadDemo0 {

    private static final Consumer<Object> printer
        = n -> System.out.println(n);

    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        printer.accept(Thread.activeCount());

        Thread.dumpStack();

        printer.accept(t.getId());
        printer.accept(t.getState());
        printer.accept("Going to sleep...");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        printer.accept("Wake up!");
    }

}


