

public class MonitorDemo2 {

    public static void main(String[] args) {

        Object resource = new Object();

        for (int i = 0; i < 3; i++) {
            (new Thread(new JThread(resource))).start();
        }
    }
}

class JThread implements Runnable {

    private Object resource;

    public JThread(Object o) {
        resource = o;
    }

    public void run() {

        Thread ct = Thread.currentThread();

        synchronized(resource) {

            System.out.println(ct.getName() + " has blocked the monitor of " + resource);
            try {
                ct.sleep(2500);
            } catch (InterruptedException e) {}
        }
        System.out.println(ct.getName() + " has released the monitor of " + resource);
    }
}

