
public class Demo1 {

    public static void main(String[] args) {

        Thread t1 = new JThread(3000);
        Thread t2 = new JThread(5000);
        Thread t3 = new JThread(10000);

        Thread mainThread = Thread.currentThread();
        
        System.out.println("Main thread wording");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Main thread ended");
    }
}

class JThread extends Thread {

    private int delay;

    public JThread(int delay) {
        this.delay = delay;
    }

    @Override
    public void run() {

        try {

            Thread t = Thread.currentThread();
            System.out.println(t + " started");
            t.sleep(delay);
            System.out.println(t + " ended");
        } catch (InterruptedException e) {

        }
    }
}

