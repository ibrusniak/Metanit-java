
import java.util.concurrent.Semaphore;

public class TwoCabineToiletDemo {

    public static void main(String[] args) {
        Semaphore toilet = new Semaphore(2);
        for(int i = 0; i < 10; i++) {
            new Employee("Employee" + i, toilet).start();
        }
    }
}

class Employee extends Thread {

    Semaphore toilet;

    public Employee(String name, Semaphore toilet) {
        super(name);
        this.toilet = toilet;
    }

    @Override
    public void run() {
        try {
            toilet.acquire();
        } catch (InterruptedException e) {
            System.out.println("Something went wrong!\n" + e);
        }
        String employeeName = currentThread().getName();
        System.out.printf("%s is pooping now...\n", employeeName);
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Something went wrong!\n" + e);
        }
        toilet.release();
        System.out.printf("%s has finished\n", employeeName);
    }
}

