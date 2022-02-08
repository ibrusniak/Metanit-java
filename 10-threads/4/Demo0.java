
import java.util.function.Consumer;

public class Demo0 {

    public static void main(String[] args) {

        Consumer<Object> console = o -> System.out.println(o);
        Thread currentThread = Thread.currentThread();
        console.accept(currentThread);
        console.accept(currentThread.getName());
        console.accept(currentThread.getPriority());
        console.accept(currentThread.isAlive());
        console.accept(currentThread.isInterrupted());
        currentThread.setName("My own thread :)");
        console.accept(currentThread);
        currentThread.setPriority(10);
        console.accept(currentThread);
    }
}


