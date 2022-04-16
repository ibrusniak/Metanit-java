
public class CommonResourceDemo2 {

    public static void main(String[] args) {
        Resource r = new Resource();
        JThread th1 = new JThread(1500, r);
        JThread th2 = new JThread(500, r);

        new Thread(th1, "JThread1").start();
        new Thread(th2, "JThread2").start();
    }
}

class Resource {
    // Public member just
    // for illustration
    public int x = 0;
}

class JThread implements Runnable {

    private Resource resource;
    private int sleepingTime;

    public JThread(int sleepingTime, Resource r) {
        this.sleepingTime = sleepingTime;
        resource = r;
    }

    public void run() {
        System.out.printf("%s %d \n", Thread.currentThread().getName(), resource.x);
        try {
            Thread.currentThread().sleep(sleepingTime);
        } catch (InterruptedException e) {}
        resource.x += 10;
        System.out.printf("%s %d \n", Thread.currentThread().getName(), resource.x);
    }
}

