
public class RunnableDemo3 {

    public static void main(String[] args) {

        Thread th1 = new Thread(() -> {

            Thread th = Thread.currentThread();
            System.out.println("started " + th);
            try {
                th.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("ended " + th);
        });

        th1.start();
        new Thread(new MyThread()).start();
    }
}

class MyThread implements Runnable {

    public void run() {

        Thread th = Thread.currentThread();
        System.out.println("started " + th);
        System.out.println("ended " + th);
    }
}

