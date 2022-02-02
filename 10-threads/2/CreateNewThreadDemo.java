
import java.util.ArrayList;
import java.util.function.Consumer;

public class CreateNewThreadDemo {

    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList<>();

        threads.add(new MyThread0(10000));
        threads.add(new MyThread0(10000));
        threads.add(new MyThread0(10000));

        Consumer<Thread> starter = th -> th.start();

        threads.forEach(starter);
    }
}

class MyThread0 extends Thread {

    private int milliseconds;

    public MyThread0(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    @Override
    public void run() {

        Thread th = Thread.currentThread();

        System.out.println(th + " started");
        try {
            System.out.println(th + " sleep for " + milliseconds + " ms...");
            th.sleep(milliseconds);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(th + " ended");
    }
}

