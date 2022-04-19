
import java.util.concurrent.Phaser;

public class PhaserDemo0 {

    public static void main(String[] args) {
        Phaser phaser = new Phaser();
        int counter = 5;
        do {
            new Thread(new Runner("Runner" + counter, phaser)).start();
        } while (--counter > 0);
    }
}

class Runner implements Runnable {

    private Phaser phaser;
    private String name;

    public Runner(String name, Phaser phaser) {
        this.name = name;
        this.phaser = phaser;
    }

    public void run() {
        Thread th = Thread.currentThread();
        phaser.register();
        System.out.printf("%s registered to %s\n", th.getName(), phaser);
        long delay = 5000;
        try {
            th.sleep(delay);
        } catch (InterruptedException e) {}
        System.out.printf("%s is executing first phase %s\n", th.getName(), phaser);
        try {
            th.sleep(delay);
        } catch (InterruptedException e) {}
        phaser.arriveAndAwaitAdvance(); // waiting for others to arrive
        System.out.printf("%s is executing second phase %s\n", th.getName(), phaser);
        try {
            th.sleep(delay);
        } catch (InterruptedException e) {}
        phaser.arriveAndAwaitAdvance(); // waiting for others to arrive
        System.out.printf("%s is executing third phase %s\n", th.getName(), phaser);
        try {
            th.sleep(delay);
        } catch (InterruptedException e) {}
        phaser.arriveAndDeregister();
        System.out.printf("%s has deregistered at %s\n", th.getName(), phaser);
    }
}

