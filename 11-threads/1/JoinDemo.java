
public class JoinDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");
        Thread t = new Thread(new FThread(), "FThread");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + " ended");
    }
}

class FThread implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + " ended");
    }
}

