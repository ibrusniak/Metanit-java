
public class ThreadCreateDemo {

    public static void main(String[] args) {
        
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " started");
        new JThread("My happy thread").start();
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
