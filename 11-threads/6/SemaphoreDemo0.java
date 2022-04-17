
import java.util.concurrent.Semaphore;

public class SemaphoreDemo0 {

    public static void main(String[] args) {
        Resource res = new Resource();
        Semaphore sem = new Semaphore(1);
        Thread th1 = new Thread(new Worker(res, sem));
        Thread th2 = new Thread(new Worker(res, sem));
        th1.start();
        th2.start();
    }
}

class Resource {}

class Worker implements Runnable {

    private Resource resource;
    private Semaphore semaphore;

    public Worker(Resource r, Semaphore s) {
        resource = r;
        semaphore = s;
    }

    public void run() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread() + " has aquired semaphore");
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {}
        semaphore.release();
        System.out.println(Thread.currentThread() + " has released semaphore");
    }
}

