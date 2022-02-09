
public class Demo3 {

    public static void main(String[] args) {

        CommonResource c = new CommonResource(1);

        for (int i = 0; i < 3; i++) {
            new Thread(new JThread(c), "th" + i).start();
        }
    }
}

class CommonResource {

    private int i;

    public CommonResource(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String toString() {
        return
            String.format("%s, i = %d", super.toString(), i);
    }
}

class JThread implements Runnable {

    private CommonResource c;

    public JThread(CommonResource c) {
        this.c = c;
    }

    public void run() {

        Thread th = Thread.currentThread();
        prn(th.getName() + " started");
        for (int i = 0; i < 3; i++) {

            prn(th.getName() + " will change common resource which current state is: " + c);
            c.setI(c.getI() + 1);
            prn(th.getName() + " has changed common resource which current state is: " + c);
            try {
                prn(th.getName() + " is going to sleep for 2 sec");
                th.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        prn(th.getName() + " ended");
    }

    private void prn(Object o) {
        System.out.println(o);
    }
}

