
public class Demo1 {

    public static void main(String[] args) {

        Thread t = new Service(100);

        try {
            t.start();
            Thread.sleep(500);
            t.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("debug 1");
    }
}

class Service extends Thread {

    private static int delay;

    public Service(int delay) {
        this.delay = delay;
    }

    @Override
    public void run() {

        System.out.println(this + " start");

        try {

            while(!interrupted()) {

                System.out.println(this + " works");
                Thread.sleep(delay);
            }
        } catch (Exception e) {
            System.out.println("debug 2");
            e.printStackTrace();
        }

        System.out.println(this + " end");
    }
}

