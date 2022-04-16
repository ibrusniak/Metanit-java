
public class WaitDemo1 {

    public static void main(String[] args) {
        Resource commonResource = new Resource();
        for (int i = 0; i < 5; i++) {
            (new Thread(new Runner(commonResource))).start();
        }
    }
}

class Resource {}

class Runner implements Runnable {

    private Resource res;

    public Runner(Resource res) {
        this.res = res;
    }

    public void run() {
        synchronized (res) {
            Thread th = Thread.currentThread();
            System.out.println(th + " going to slep for 2 sec");
            try {
                th.sleep(2000);
            } catch (InterruptedException e) {}
            System.out.println(th + " has woke up");
            System.out.println(th + " going to wait");
            try {
                res.wait();
            } catch (InterruptedException e) {}
            
        }
    }
}

