
public class RunnableDemo {

    public static void main(String[] args) {

        Thread th = Thread.currentThread();
        System.out.println(th + " start");
        Thread myThread = new Thread(new MyThread(), "My thread 0");
        myThread.start();
        try {
            myThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(th + " end");
    }
}

class MyThread implements Runnable {

    public void run() {

        Thread th = Thread.currentThread();
        System.out.println(th + " start");
        try {
            th.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(th + " end");
    }
}

