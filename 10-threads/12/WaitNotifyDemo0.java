
public class WaitNotifyDemo {

    public static void main(String args[]) {

        JThread0 thread = new JThread0();

        thread.start();
        boolean cont = true;
        while (cont) {

            System.out.println(thread + " " + thread.getState());

            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {}

            if (thread.getState() == Thread.State.TERMINATED)
                break;
        }
    }
}

class JThread0 extends Thread {

    @Override
    public void run() {

        Object o = new Object();

        synchronized (o) {

            try {
                System.out.println("wait");
                o.wait(7000);
            } catch (Exception e) {}

            try {
                System.out.println("sleep 2");
                sleep(7000);
            } catch (InterruptedException e) {}
        }
    }
}

