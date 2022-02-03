
import java.util.ArrayList;
import java.util.function.Consumer;

public class InterruptionDemo1 {

    public static void main(String[] args) {

        ArrayList<Runnable> threads = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            threads.add(() -> {
                Thread th = Thread.currentThread();
                System.out.println(th + " started");
                boolean b = true;
                while (b) {}
                System.out.println(th + " ended");
            });
        }

        threads.forEach((r) -> new Thread(r).start());
    }
}


