
public class ThreadEndingDemo2 {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        MThread mt = new MThread();
        Thread t = new Thread(mt, "MThread");
        t.start();
        try {
            mainThread.sleep(2000);
        } catch (InterruptedException e) {}
        t.interrupt();
    }
}

class MThread implements Runnable {

    public void run() {
        Thread ct = Thread.currentThread();
        String threadName = ct.getName();
        System.out.println(threadName + " started");
        int counter = 0;
        while (!ct.isInterrupted()) {
            System.out.println("Loop cycle " + counter);
            try {
                ct.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted (inside try-catch block)");
                break;
            }
        }
        System.out.println(threadName + " ended");
    }
}

