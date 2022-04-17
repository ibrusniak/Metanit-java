
public class ToiletDemo {

    public static void main(String[] args) {
        Toilet toilet = new Toilet();
        Employee jack = new Employee("Jack", toilet, 5000);
        Employee lucia = new Employee("Lucia", toilet, 3000);
        Employee gordon = new Employee("Gordon", toilet, 11000);
        jack.start();
        lucia.start();
        gordon.start();
    }
}

class Toilet {

    public void poop(long howLong) {
        Thread th = Thread.currentThread();
        try {
            System.out.printf("%s is pooping for %d seconds\n", th.getName(), howLong / 1000);
            th.sleep(howLong);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Employee extends Thread {

    private Toilet toilet;
    private long timeToPoop;

    public Employee(String name, Toilet toilet, long timeToPoop) {
        super(name);
        this.toilet = toilet;
        this.timeToPoop = timeToPoop;
    }

    @Override
    public void run() {
        String name = currentThread().getName();
        System.out.println(name + " is trying to acquire the toilet...");
        synchronized (toilet) {
            toilet.poop(timeToPoop);
        }
        System.out.println(name + " has released the toilet...");
    }
}

