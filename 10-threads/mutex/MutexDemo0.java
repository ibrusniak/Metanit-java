
import java.util.Scanner;
import java.util.ArrayList;
import java.util.function.Consumer;

public class MutexDemo0 {

    public static void main(String[] args) {

        Scanner keyboardReader = new Scanner(System.in);
        ArrayList<JThread1> threads1 = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            threads1.add(new JThread1());
        
        System.out.println("Main started");

        threads1.forEach((th) -> {
            th.start();
            try {
                th.join();
            } catch (InterruptedException e) {}
        });

        System.out.println("Main ended");
    }
}


class JThread1 extends Thread {

    @Override
    public void run() {

        System.out.println(Thread.currentThread() + " begin wasting time");
        wasteTime();
        System.out.println(Thread.currentThread() + " has finished");
    }

        // This causes nothing. No, any blocking.
        // There is no object with a blocked mutex.
        // So every thread works in parallel
        synchronized void wasteTime() {
        try {
            sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}

class Resource {
    int x;
}

class JThread2 extends Thread {

    private Resource r;

    public JThread2(Resource res) {
        r = res;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread() + " begin wasting time");
        wasteTime();
        System.out.println(Thread.currentThread() + " has finished");

        System.out.println();
    }

    synchronized void wasteTime() {

        r.x++;
        try {
            sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}


