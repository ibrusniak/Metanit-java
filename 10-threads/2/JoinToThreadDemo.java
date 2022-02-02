
public class JoinToThreadDemo {

    public static void main(String[] args) {

        Thread th = Thread.currentThread();
        System.out.println(th + " started");
        Thread th1 = new MyThread(2000);
        Thread th2 = new MyThread(7000);
        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(th + " ended");
    }
}

class MyThread extends Thread {

    private int delay;

    public MyThread(int millis) {
        delay = millis;
    }

    @Override
    public void run() {

        Thread th = Thread.currentThread();

        System.out.println(th + " started");

        try {
            th.sleep(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(th + " ended");
    }
}

