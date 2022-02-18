
import java.util.Scanner;

public class Demo0 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        JThread worker = new JThread();
        worker.start();
        // Waint until user enter something
        System.out.println("Enter any string to stop worker");
        in.nextLine();
        worker.disable();
    }
}

class JThread extends Thread {

    private boolean isActive;

    public JThread() {
        isActive = true;
    }

    public void disable() {
        isActive = false;
    }

    public void run() {

        Thread t = Thread.currentThread();
        while (isActive) {

            try {
                System.out.println(t + " is working");
                t.sleep(1000);                
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println(t + " has been interrupted");
    }
}

