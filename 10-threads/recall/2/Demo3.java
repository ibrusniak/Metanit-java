
public class Demo3 {

    public static void main(String[] args) {

        /**
         * Runnable is functional interface, so i can use lambda function.
         * Constructor Thread(Runnable, Name) determines this is lambda-
         * implamentation of Runnable. So it works well!
         */
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 12; i++) {
                System.out.println("Knock-knock");
                try {
                    Thread.currentThread().sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "thread_knocker");

        t1.start();

        // Classic Runnable implementation (without lambdas)
        Thread t2 = new Thread(new Runnable(){
            public void run() {
                for(int i = 0; i < 12; i++) {
                    System.out.println("woooo...");
                    try {
                        Thread.currentThread().sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "thread_ghost");

        t2.start();

        try {
            Thread.currentThread().sleep(1600);
            new Thread(new JThread(), "simple_thread").start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class JThread implements Runnable {

    public void run() {

        System.out.println("Simple implementation of Runnable");
    }
}

