
public class MonitorDemo0 {

    public static void main(String[] args) {

        Printer commonPrinter = new Printer();

        for (int i = 0; i < 5; i++) {
            new JThread1(commonPrinter).start();
        }

        for (int i = 0; i < 5; i++) {
            new JThread2(commonPrinter).start();
        }
    }
}

class JThread1 extends Thread {

    private Printer printer;

    public JThread1(Printer p) {
        printer = p;
    }

    @Override
    public void run() {

        Thread ct = Thread.currentThread();

        for (int i = 0; i < 5; i++) {

            try {
                sleep(400);
            } catch (InterruptedException e) {}
            printer.printUnsynchronized(ct.getName() + " " + i);
        }
    }
}

class JThread2 extends Thread {

    private Printer printer;

    public JThread2(Printer p) {
        printer = p;
    }

    @Override
    public void run() {

        Thread ct = Thread.currentThread();

        for (int i = 0; i < 5; i++) {

            try {
                sleep(400);
            } catch (InterruptedException e) {}
            printer.printSynchronized(ct.getName() + " " + i);
        }
    }
}

class Printer {

    public void printUnsynchronized(Object o) {
        System.out.println(o);
    }

    public synchronized void printSynchronized(Object o) {
        System.out.println(o);
    }
}




