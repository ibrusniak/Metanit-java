
public class Demo2 {

    public static void main(String[] args) {

        Runnable r = () -> {

            try {
                System.out.println("st");
                Thread.currentThread().sleep(6000);
                System.out.println("end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        System.out.println("main st");
        Thread t = new Thread(r);
        t.start();

        /**
         * Main thread joins to thread "t" and wait
         * until "t" ends his work (sleep 6 sec)
         */
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main end");
    }
}



