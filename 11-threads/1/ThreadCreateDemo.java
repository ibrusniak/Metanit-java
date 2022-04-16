
public class ThreadCreateDemo {

    public static void main(String[] args) {
        
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " started");
        new JThread("My happy thread").start();
        new FThread("Runnable thread").start();
        System.out.println(mainThread.getName() + " ended");
    }
}

class JThread extends Thread {

    public JThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName() + " started");
        try {
            sleep(1000);
        } catch (InterruptedException e) {}
        System.out.println(currentThread().getName() + " ended");
    }
}

class FThread implements Runnable {

    public FThread(String threadName) {
        Thread.currentThread().setName(threadName);
    }

    public void run() {
        Thread ct = Thread.currentThread();
        System.out.println(ct.getName() + " started");
        try {
            sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println(ct.getName() + " ended");
    }
}

