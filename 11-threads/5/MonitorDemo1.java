
public class MonitorDemo0 {

    public static void main(String[] args) {
        Resource res = new Resource();
        int counter = 10;
        do {
            (new Thread(new JThread(res))).start();
        } while (--counter > 0);
    }
}

class Resource {

    public synchronized void doNothinForPeriod(long millis) {
        System.out.printf("Thread [%s] has aquired the mutex\n", Thread.currentThread().getName());
        try {
            wait(millis);
        } catch (InterruptedException e) {}
        System.out.printf("Thread [%s] has released the mutex\n", Thread.currentThread().getName());
    }
}

class JThread implements Runnable {

    private Resource r;

    public JThread(Resource r) {
        this.r = r;
    }

    public void run() {
        r.doNothinForPeriod(0);
    }
}

