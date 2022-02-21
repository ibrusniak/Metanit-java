

public class ThreadDemo1 {

    public static void main(String[] args) {

        java.util.Scanner in = new java.util.Scanner(System.in);
        Thread t = new Thread(new Worker());
        t.start();
        in.nextLine();
        t.interrupt();
    }
}

class Worker implements Runnable {

    public void run() {

        System.out.println("started");
        Thread currentThread = Thread.currentThread();
        while (!currentThread.isInterrupted()) {

            System.out.println("working");
            try {
                currentThread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("interrupted: " + currentThread.isInterrupted());
                currentThread.interrupt();
            }
        }
        System.out.println("ended");
    }
}

