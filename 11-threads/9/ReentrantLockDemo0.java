
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo0 {

    public static void main(String[] args) {
        ReentrantLock locker = new ReentrantLock();
        for(int i = 0; i < 4; i++) {
            new Thread(new Worker(locker)).start();
        }
    }
}

class Worker implements Runnable {

    private ReentrantLock locker;

    public Worker(ReentrantLock lock) {
        locker = lock;
    }

    public void run() {
        locker.lock();
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {

        } finally {
            locker.unlock();
        }
    }
}

