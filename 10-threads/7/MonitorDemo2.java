
public class MonitorDemo2 {

    public static void main(String[] args) {

        CommonResource cr = new CommonResource();

        for (int i = 0; i < 3; i++) {
            new JThread(cr).start();
        }
    }
}

class CommonResource {}

class JThread extends Thread {

    private CommonResource cr;

    public JThread(CommonResource cr) {
        this.cr = cr;
    }

    @Override
    public void run() {

        Thread ct = Thread.currentThread();

        synchronized(cr) {
            System.out.println(ct.getName() + " has entered synchronized section");
            try {
                sleep(5000);
            } catch (InterruptedException e) {}
            try {
                cr.notify();
            } catch (Exception e) {}
            try {
                sleep(5000);
            } catch (InterruptedException e) {}
            System.out.println(ct.getName() + " has exited synchronized section");
        }
    }
}

