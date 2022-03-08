
public class WaitNotifyDemo1 {

    public static void main(String[] args) {

        Object commonResource = new Object();
        System.out.println("\nPress CTRL+C to interrupt cycle\n");
        Thread0 t0 = new Thread0(commonResource);
        Thread1 t1 = new Thread1(commonResource);
        StatePrinter printer = new StatePrinter(t0, t1);
        printer.start();
        Thread ct = Thread.currentThread();

        try { ct.sleep(3000); } catch (Exception e) {}
        t0.start();
        try { ct.sleep(3000); } catch (Exception e) {}
        t1.start();
    }
}

class StatePrinter extends Thread {

    private Thread0 t0;
    private Thread1 t1;

    public StatePrinter(Thread0 t0, Thread1 t1) {
        this.t0 = t0;
        this.t1 = t1;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("T0: " + t0.getState() + ", T1: " + t1.getState());
            try {
                Thread.currentThread().sleep(1000);
            } catch (Exception e) {}
        }
    }
}

class Thread0 extends Thread {

    private Object commonResource;

    public Thread0(Object res) {
        commonResource = res;
    }

    @Override
    public void run() {

        synchronized (commonResource) {

            try {
                commonResource.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread1 extends Thread {

    private Object commonResource;

    public Thread1(Object res) {
        commonResource = res;
    }

    @Override
    public void run() {

        synchronized (commonResource) {

            try {
                commonResource.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

