
import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {

    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList<>();

        threads.add(new Thread(new Worker()));
        threads.add(new Thread(new Worker()));
        threads.add(new Thread(new Worker()));

        Iterator<Thread> iterator = threads.iterator();

        while(iterator.hasNext()) {
            new Thread(iterator.next()).start();
        }
    }
}

class Worker implements Runnable {

    public void run() {

        Thread t = Thread.currentThread();

        try {
            System.out.println(t + " --- started");
            t.sleep(5000);
            System.out.println(t + " --- ended");
        } catch (InterruptedException e) {
            System.out.println(t.getName() + " --- was interrupted");
        }
    }
}
