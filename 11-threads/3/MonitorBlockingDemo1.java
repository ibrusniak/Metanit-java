
public class MonitorBlockingDemo1 {

    public static void main(String[] args) {
        Resource commonResource = new Resource();
        int counter = 5;
        do {
            new Thread(new Worker(commonResource), "Worker" + counter).start();
        } while (--counter > 0);
    }
}

class Resource {}

class Worker implements Runnable {

    private Resource resource;

    public Worker(Resource resource) {
        this.resource = resource;
    }

    public void run() {
        Thread th = Thread.currentThread();
        System.out.printf("%s is trying to block  %s\n", th.getName(), resource);
        synchronized (resource) {
            System.out.printf("%s is blocked by %s\n", resource, th.getName());
            try {
                th.sleep(2000);
            } catch (InterruptedException e) {}
            System.out.printf("%s is released by %s\n", resource, th.getName());
        }
    }
}

