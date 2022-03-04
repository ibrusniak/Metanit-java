
import java.util.function.Consumer;

public class WaitDemo {

    public static void main(String[] args) {

        Worker w = new Worker(new Object());
        w.start();

        Thread ct = Thread.currentThread();

        for (int i = 0; i < 10; i++) {

            System.out.println(w.getName() + ", " + w.isAlive() + ", " + w.isInterrupted());
            try {
                ct.sleep(1200);
            } catch (InterruptedException e) {}
        }
    }
}

class Worker extends Thread {

    private Object o;

    public Worker(Object o) {
        this.o = o;
    }

    @Override
    public void run() {

        synchronized (o) {

            try {
                // this is cause of
                // waiting forever
                o.wait(12000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

