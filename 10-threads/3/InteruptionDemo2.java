
public class InterruptionDemo2 {

    public static void main(String[] args) {

        MyThread th = new MyThread();

        try {
            
            Thread currentThread = Thread.currentThread();
            System.out.printf("[%s] is working\n", currentThread);
            MyThread m = new MyThread();
            m.start();
            currentThread.sleep(10);
            m.disable();
            System.out.printf("[%s] is ended\n", currentThread);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread {

    private boolean isAlive;

    public MyThread() {
        isAlive = true;
    }

    public void disable() {
        isAlive = false;
    }

    @Override
    public void run() {

        Thread currentThread = Thread.currentThread();
        while (isAlive)
            System.out.printf("[%s] is working\n", currentThread);
        System.out.printf("[%s] has disabled\n", currentThread);
    }
}

