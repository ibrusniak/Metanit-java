
public class SynchronizedDemo2 {

    public static void main(String[] args) {

        Resource r1 = new Resource();

        Incrementer inc1 = new Incrementer(r1);
        inc1.start();

        try {
            inc1.join();
        } catch (InterruptedException e) {}

        System.out.println();
        System.out.println();

        Resource r2 = new Resource();
        
        Incrementer inc2 = new Incrementer(r2);
        Incrementer inc3 = new Incrementer(r2);
        Incrementer inc4 = new Incrementer(r2);

        inc2.start();
        inc3.start();
        inc4.start();
    }
}

class Resource {

    private int i;

    public void increment() {
        i++;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}

class Incrementer extends Thread {

    private Resource resource;

    public Incrementer(Resource r) {
        resource = r;
    }

    @Override
    public void run() {
        
        synchronized (resource) {
            Thread ct = Thread.currentThread();
            System.out.println(ct.getName() + " has began. Resource = " + resource);
            for (int i = 0; i < 3; i++) {
                resource.increment();
                try {
                    sleep(300);
                } catch (InterruptedException e) {}
                System.out.println(ct.getName() + " has incremented resource. Resource = " + resource);
            }
            System.out.println(ct.getName() + " has ended. Resource = " + resource);
        }
    }
}

