
public class SynchronizationDemo1 {

    public static void main(String[] args) {
        Resource resource = new Resource();
        int counter = 3;
        while (counter-- > 0) {
            new JThread("TH" + counter, resource).start();
        }
    }
}

class Resource {
    public int x = 0; // public variable just for demonstration !
}

class JThread extends Thread {

    private Resource res;

    public JThread(String threadName, Resource res) {
        super(threadName);
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            res.x = 1;
            for (int i = 1; i <= 3; i++) {
                System.out.printf("Thread %s, iteration %d, res.x = %d\n",
                    currentThread().getName(), i, res.x);
                res.x++;
            }
        }
    }
}

