
public class Demo0 {

    public static void main(String[] args) {

        Wrapper w = new Wrapper(10);

        for (int i = 1; i < 5; i++) {

            new MyThread("TH" + i, w).start();
        }
    }
}

class Wrapper {

    private int x;

    public Wrapper(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return String.format("[%s] x = %d", super.toString(), x);
    }
}

class MyThread extends Thread {

    private Wrapper wrapper;

    public MyThread(String ThreadName, Wrapper w) {

        super(ThreadName);
        wrapper = w;
    }

    @Override
    public void run() {

        try {

            wrapper.setX(wrapper.getX() + 1);
            System.out.printf("Works [%s] %s\n", this, wrapper);
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

