
public class Demo1 {

    public static void main(String[] args) {

        POJO commonResource = new POJO();

        Thread t1 = new Thread(new Process(commonResource));

        System.out.println(commonResource); // 0
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(commonResource); // 4
    }
}

class POJO {

    private int i;

    {
        i = 0;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}

class Process implements Runnable {

    private POJO pojo;

    public Process(POJO p) {
        pojo = p;
    }

    public void run() {

        pojo.setI(0);
        for (int i = 0; i < 3; i++) {

            pojo.setI(pojo.getI() + 1);
            System.out.printf("%s %s\n", this, pojo);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}

