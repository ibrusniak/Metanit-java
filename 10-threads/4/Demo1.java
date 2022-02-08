
public class Demo0 {

    public static void main(String[] args) {

        final long MILLIS = 5000l;

        Thread t1 = new Thread(new MyThread1(MILLIS));
        MyThread2 t2 = new MyThread2(MILLIS);
        Thread t = Thread.currentThread();

        System.out.printf("%s start\n", t);
        t1.start();
        t2.start();
        System.out.printf("%s end\n", t);
    }
}

class MyThread1 implements Runnable {

    private long millis;

    public MyThread1(long millis) {
        this.millis = millis;
    }

    public void run() {

        Thread t = Thread.currentThread();
        System.out.printf("%s start\n", t);
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s end\n", t);
    }
}

class MyThread2 extends Thread {

    private long millis;

    public MyThread2(long millis) {
        this.millis = millis;
    }

    @Override
    public void run() {

        Thread t = Thread.currentThread();
        System.out.printf("%s start\n", t);
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s end\n", t);
    }
}


