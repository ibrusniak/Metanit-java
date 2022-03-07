
public class WaitNotifyDemo0 {

    public static void main(String[] args) {

        Resource r = new Resource();

        for (int i = 0; i < 3; i++) {
            new SomeWorker(r).start();
        }
    }
}

public class Resource {

    private boolean monitorIsBlocked;

    public void setMonitor(boolean status) {
        monitorIsBlocked = status;
    }

    public boolean monitorIsBlocked() {
        return monitorIsBlocked;
    }
}

class SomeWorker extends Thread {

    private Resource r;

    public SomeWorker(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {

        Thread th = Thread.currentThread();

        synchronized (r) {

            if (r.monitorIsBlocked()) {

                System.out.println(th.getName() + " resource is blocek. Unblocking...");
                try {
                    sleep(1500);
                } catch (Exception e) {}
                try {
                    r.notify();
                    r.setMonitor(false);
                } catch (Exception e) {}
            } else {

                System.out.println(th.getName() + " resource isn't blocek. Blocking...");
                try {
                    sleep(1500);
                } catch (Exception e) {}
                try {
                    r.wait();
                    r.setMonitor(true);
                } catch (Exception e) {}
            }
        }
    }
}


