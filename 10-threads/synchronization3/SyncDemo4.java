import java.rmi.server.ObjID;

public class SyncDemo4 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new Worker().start();
        }
    }
}

class Worker extends Thread {

    @Override
    public void run() {

        // This do nothing
        synchronized (new Object()) {
            try {
                System.out.println(currentThread() + " working");
                sleep(1400);
            } catch (Exception e) {
            }
        }
    }
}
