
public class WaitNotifyDemo1 {

    public static void main(String[] args) {

        Resource commonResource = new Resource();

        Worker w1 = new Worker("w1", commonResource);
        Worker w2 = new Worker("w2", commonResource);

        w2.start();
        w1.start();
    }
}

class Resource {
    public boolean isBlocked;
}

class Worker extends Thread {

    private Resource commonResource;

    public Worker(String threadName, Resource commonResource) {
        
        super(threadName);
        this.commonResource = commonResource;
    }

    @Override
    public void run() {

        synchronized (commonResource) {

            if (!commonResource.isBlocked) {

                try {
                    System.out.println(currentThread() + " is blocking common resource");
                    commonResource.isBlocked = true;
                    commonResource.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {

                try {
                    System.out.println(currentThread() + " is unblocking common resource");
                    commonResource.isBlocked = false;
                    commonResource.notify();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


