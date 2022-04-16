
public class CommonResourceDemo1 {

    public static void main(String[] args) {
        Resource commonResource = new Resource();
        for (int i = 1; i < 4; i++) {
            (new Worker("Worker " + i, commonResource)).start();
        }
    }
}

class Resource {

    private int i = 0;

    public void increment() {
        i++;
    }

    public void set(int n) {
        i = n;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}

class Worker extends Thread {

    private Resource resource;

    public Worker(String name, Resource r) {
        super(name);
        resource = r;
    }

    @Override
    public void run() {
        int i = 3;
        resource.set(1);
        do {
            System.out.printf("%s %s\n", currentThread().getName(), resource);
            resource.increment();
            try {
                currentThread().sleep(500);
            } catch (InterruptedException e) {}
        } while (--i > 0);
    }
}

