

public class SyncDemo2 {

    public static void main(String[] args) {

        Resource commonResource = new Resource();

        for (int i = 0; i < 5; i++) {
            new Thread(new Worker(commonResource), "Thread" + i).start();
        }
    }
}

class Worker implements Runnable {

    private Resource resource;

    public Worker(Resource resource) {
        this.resource = resource;
    }

    public void run() {

        Thread t = Thread.currentThread();

        for (int i = 0; i < 5; i++) {

            System.out.println(t.getName() + " " + resource.x);
            resource.x++;
            try {
                t.sleep(300);
            } catch (InterruptedException e) {}
        }
    }
}

class Resource {
    int x;
}


