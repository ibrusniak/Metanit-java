
public class SynchronizedDemo0 {

    public static void main(String[] args) {

        for(int i = 0; i < 4; i ++)
            new JThreadWithoutSynchronization().start();
    }
}

class JThreadWithoutSynchronization extends Thread {

    private static int threadsCount;

    public JThreadWithoutSynchronization() {
        super("JThreadWithoutSynchronization_" + threadsCount);
        threadsCount++;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            try {
                sleep(2000);
            } catch (InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}


