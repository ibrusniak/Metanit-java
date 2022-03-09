
import java.util.concurrent.Semaphore;

public class SemaphoreDemo1 {

    public static void main(String[] args) {

        // Only two people can eat their meals
        // at one moment of time at this table
        Semaphore table = new Semaphore(2);

        Human h1 = new Human(table, "Ivan");
        Human h2 = new Human(table, "Jonh");
        Human h3 = new Human(table, "Doe");
        Human h4 = new Human(table, "Silvia");
        Human h5 = new Human(table, "Karol");

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
    }
}

class Human extends Thread {

    private Semaphore table;
    private String name;

    public Human(Semaphore table, String name) {
        this.table = table;
        this.name = name;
    }

    @Override
    public void run() {

        try {
            table.acquire();
            System.out.println(this + " sit at the table...");
        } catch (InterruptedException e) {}

        try {
            sleep(2500);
        } catch (InterruptedException e) {}

        table.release();
        System.out.println(this + " out from the table...");
    }

    @Override
    public String toString() {
        return name;
    }
}



