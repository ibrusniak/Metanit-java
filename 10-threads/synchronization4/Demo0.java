
public class Demo0 {

    public static void main(String[] args) {

        Resource r = new Resource();
        for (int i = 0; i < 5; i++) {

            Thread t = new JThread("thread " + i, r);
            t.setPriority(i + 2);
            t.start();
        }
    }
}

class Resource {

    int x = 0;

    public void increment() {
        x++;
    }
}

class JThread extends Thread {

    private Resource r;

    public JThread(String name, Resource res) {
        super(name);
        r = res;
    }

    @Override
    public void run() {

        Thread t = Thread.currentThread();

        synchronized(r) {
            for (int i = 0; i < 5; i ++) {

                System.out.println(t.getName() + ": " + r.x);
                r.increment();
                try {
                    sleep(1200);
                } catch (Exception e) {
                }
            }
        }
    }
}


