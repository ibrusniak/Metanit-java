

public class SyncDemo0 {

    public static void main(String[] args) {

        Resource commonResource = new Resource();

        Worker w = new Worker(commonResource);
        w.start();

        try {
            w.join();
        } catch (Exception e) {}
        System.out.println();

        Worker w2 = new Worker(commonResource);
        Worker w3 = new Worker(commonResource);
        w2.start();
        w3.start();
    }
}

class Worker extends Thread {

    private Resource resource;

    public Worker(Resource r) {
        resource = r;
    }

    @Override
    public void run() {

        Thread t = Thread.currentThread();

        for (int i = 0; i < 5; i++) {
            System.out.println(t + ": " + resource.get());
            resource.increment();
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

class Resource {

    private int v = 0;

    public Resource() {
        this.v = 0;
    }

    public void set(int v) {
        this.v = v;
    }

    public int get() {
        return v;
    }

    public void increment() {
        v++;
    }
}


