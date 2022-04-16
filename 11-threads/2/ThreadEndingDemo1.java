
public class ThreadEndingDemo1 {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        JThread jt = new JThread("JThread");
        jt.start();
        try {
            mainThread.sleep(3000);
        } catch (InterruptedException e) {}
        jt.disable();
    }
}

class JThread extends Thread {

    private boolean isActive;
    
    public JThread(String threadName) {
        super(threadName);
        isActive = true;
    }

    public void disable() {
        isActive = false;
    }

    public void run() {
        Thread th = Thread.currentThread();
        System.out.println(th.getName() + " started");
        while (isActive) {
            System.out.println(th.getName() + " working");
            try {
                th.sleep(500);
            } catch (InterruptedException e) {}
        }
        System.out.println(th.getName() + " ended");
    }
}

