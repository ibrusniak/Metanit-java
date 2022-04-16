
public class SynchronizationDemo2 {

    public static void main(String[] args) {

        Printer commonPrinter = new Printer();
        for (int i = 0; i < 3; i++) {
            // "race condition"
            //new JThread(commonPrinter).start();
            new MThread(commonPrinter).start();
        }
    }
}

class Printer {

    public void print(Thread th) {
        for (int i = 0; i < 3; i++) {
            System.out.println(th);
        }
    }
}

class JThread extends Thread {

    private Printer p;

    public JThread(Printer p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.print(this);
    }
}

class MThread extends Thread {

    private Printer p;

    public MThread(Printer p) {
        this.p = p;
    }

    @Override
    public void run() {
        synchronized (p) {
            p.print(this);
        }
    }
}

