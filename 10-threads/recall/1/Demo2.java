
public class Demo2 {

    public static void main(String[] args) {

        Thread t0 = new Thread(new JThread(), "t0");

        Thread mainThread = Thread.currentThread();

        t0.start();

        for (int i = 0; i < 15; i++) {

            try {

                System.out.printf("t0.isAlive(): %s\n", t0.isAlive());
                mainThread.sleep(500);
                if (i == 12) {
                    t0.interrupt();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class JThread implements Runnable {

    private final boolean CONTINUE = true;

    public void run() {

        while (CONTINUE) {

            if (Thread.currentThread().isInterrupted()) {
                return;
            }
        }
    }
}

