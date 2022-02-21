
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

    private boolean isActive;

    public JThread() {
        isActive = true;
    }

    public void run() {

        System.out.println("The thread has been started");

        Thread t = Thread.currentThread();

        int maxIterationsCount = 20;
        int iterations = 0;
        
        while(isActive) {

            System.out.println("The thread is working");
            try {
                t.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
            // restriction
            if ((++iterations) == maxIterationsCount) break;
        }
        System.out.println("The thread has been ended by itself");
    }
}

