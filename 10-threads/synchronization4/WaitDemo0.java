
public class WaitDemo0 {

    public static void main(String[] args) {

        Object resource = new Object();
        new JThread(resource).start();
    }
}

class JThread extends Thread {

    private Object resource;

    public JThread(Object r) {
        resource = r;
    }

    @Override
    public void run() {

        System.out.println("started");
        try {
            // Exception in thread "Thread-0" java.lang.IllegalMonitorStateException:
            // current thread is not owner
            resource.wait(5000);
        } catch (InterruptedException e) {
        }
        System.out.println("ended");
    }
}

