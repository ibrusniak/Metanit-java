
public class PriorityDemo0 {

    public static void main(String[] args) {

        Resource r = new Resource();

        int priority = 0;
        for (int i = 0; i < 4; i++) {

            if (i == 0) priority = 1;
            else priority += 2;

            new JThread(r, priority).start();
        }
    }
}


class JThread extends Thread {

    private Resource r;

    public JThread(Resource r, int priority) {
        this.r = r;
        super.setPriority(priority);
    }

    @Override
    public void run() {

        synchronized(r) {

            for (int i = 0; i < 5; i++) {

                System.out.println(currentThread() + " " + r.x);
                r.x++;
                try {
                    sleep(1200);
                } catch (InterruptedException e) {
                }
            }
        }
        System.out.println();
    }
}

class Resource {
    int x = 0;
}

