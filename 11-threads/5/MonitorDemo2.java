
public class MonitorDemo0 {

    public static void main(String[] args) {
        Resource res = new Resource();
        Thread thread0 = new Thread(new Worker(res, "wait"));
        Thread thread1 = new Thread(new Worker(res, "wait"));
        Thread thread2 = new Thread(new Worker(res, "notify"));
        thread0.start();
        thread1.start();
        try{
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {}
        thread2.start();
    }
}

class Resource {}

class Worker implements Runnable {

    private Resource res;
    private String whatToDo;

    public Worker(Resource res, String whatToDo) {
        this.res = res;
        this.whatToDo = whatToDo;
    }

    public void run() {
        String context = Thread.currentThread().getName();
        synchronized (res) {
            System.out.println(context + " entered synchronized block");
            if (whatToDo == "wait") {
                try {
                    res.wait();
                } catch (InterruptedException e) {}
            } else if (whatToDo == "notify") {
                res.notify();
            }
        }
        System.out.println(context + " exited synchronized block");
    }
}

