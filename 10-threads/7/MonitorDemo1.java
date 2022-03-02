
public class MonitorDemo1 {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            new JThread().start();
        }
    }
}

class JThread extends Thread {

    @Override
    public void run() {
        SPrinter.print();
    }
}

class SPrinter {

    public static synchronized void print() {

        Thread ct = Thread.currentThread();
        System.out.println(ct.getName() + " into synchronized section...");
        try {
            ct.sleep(5000);
        } catch (InterruptedException e) {}
        System.out.println(ct.getName() + " exiting from synchronized section");
    }
}

