import java.util.concurrent.Phaser;

public class phaserDemo2 {

    public static void main(String[] args){
        Phaser phaser = new Phaser();
        new Thread(new Runner("Runner1", phaser, 5000l)).start();
        new Thread(new Runner("Runner2", phaser, 2000l)).start();
        new Thread(new Runner("Runner3", phaser, 3000l)).start();
        new Thread(new Runner("Runner4", phaser, 7000l)).start();
    }
}

class Runner implements Runnable {

    private Phaser phaser;
    private String name;
    private long delay;

    public Runner(String name, Phaser phaser, long delay) {
        this.name = name;
        this.phaser = phaser;
        phaser.register();
        this.delay = delay;
    }

    public void run() {
        prn(name + " is executhing the phase " + phaser.getPhase());
        try {
            Thread.currentThread().sleep(delay);
        } catch (InterruptedException e) {}
        phaser.arriveAndAwaitAdvance();
        prn(name + " is executhing the phase " + phaser.getPhase());
        try {
            Thread.currentThread().sleep(delay);
        } catch (InterruptedException e) {}
        phaser.arriveAndAwaitAdvance();
        prn(name + " is executhing the phase " + phaser.getPhase());
        try {
            Thread.currentThread().sleep(delay);
        } catch (InterruptedException e) {}
        phaser.arriveAndDeregister();
    }

    public static void prn(Object o) {
        System.out.println(o);
    }
}

