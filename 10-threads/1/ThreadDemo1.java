
import java.util.ArrayList;
import java.util.function.Consumer;

class ThreadDemo1 {

    public static void main(String[] args) {

        System.out.println();

        ArrayList<MyThread> threads = new ArrayList<>();

        for (int i = 0; i < 100; i++)
            threads.add(new MyThread());

        Consumer<MyThread> runner = thread -> thread.start();
        threads.forEach(runner);
    }
}

class MyThread extends Thread implements Runnable {

    public void run() {
        
        long id = getId();
        System.out.printf("started [%s]\n", id);
        try {
            sleep(60000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.printf("ended [%s]\n", id);
    }
}

