
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Press enter to begin synchronously execution: ");
        in.nextLine();

        System.out.println();

        for (int i = 0; i < 6; i++)
            new JThread1().start();


        System.out.println();
        System.out.print("Press enter to begin Asynchronously execution: ");
        in.nextLine();

        System.out.println();

        for (int i = 0; i < 6; i++)
            new JThread2().start();
    }
}

class JThread1 extends Thread {

    @Override
    public void run() {
        SomeClass0.wasteTimeSynchronously();
    }
}

class JThread2 extends Thread {

    @Override
    public void run() {
        SomeClass0.wasteTimeAsynchronously();
    }
}

class SomeClass0 {

    synchronized public static void wasteTimeSynchronously() {
        
        try {
            Thread.currentThread().sleep(2000);
            System.out.println(Thread.currentThread().getName() + " has finished");
        } catch (InterruptedException e) {
        }
    }

    public static void wasteTimeAsynchronously() {
        
        try {
            Thread.currentThread().sleep(2000);
            System.out.println(Thread.currentThread().getName() + " has finished");
        } catch (InterruptedException e) {
        }
    }
}

