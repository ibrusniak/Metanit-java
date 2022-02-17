
import java.util.Random;

public class Demo0 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new MyThread().start();
        }
    }
}

class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("started " + Thread.currentThread());
        try {
            int rnd = new Random().nextInt(5000);
            sleep(rnd + 2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ended " + Thread.currentThread());
    }
}

