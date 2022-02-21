
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        JThread t = new JThread();
        t.start();
        in.nextLine();
        t.interrupt();
    }
}

class JThread extends Thread {

    public void run() {

        System.out.println("started");

        Thread t = Thread.currentThread();

        while(!t.isInterrupted()) {

            System.out.println("working");
            try {
                t.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
                break;
            }
        }
        System.out.println("ended");
    }
}

