
public class Demo0 {

    public static void main(String[] args) {

        Object resource = new Object();

        for (int i = 0; i < 2; i++) {
            new JThread(resource).start();
        }
    }
}

class JThread extends Thread {

    private Object res;

    public JThread(Object r) {
        res = r;
    }

    @Override
    public void run() {

        Thread ct = currentThread();

        synchronized (res) {

            System.out.println("The monitor of " + res + " has blocked by " + ct.getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(ct.getName() + " was interrupted");
            }
            try {
                res.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("The monitor of " + res + " has released by " + ct.getName());
        }
    }
}


