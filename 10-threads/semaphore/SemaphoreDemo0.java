
import java.util.concurrent.Semaphore;

public class SemaphoreDemo0 {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(5);

        for (int i = 0; i < 12; i++) {
            new JThread(semaphore).start();
        }
    }
}

class JThread extends Thread {

    private Semaphore semaphore;

    public JThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {

        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(currentThread() + " has asquired semaphore " + semaphore);
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        System.out.println(currentThread() + " has released semaphore " + semaphore);
    }
}



