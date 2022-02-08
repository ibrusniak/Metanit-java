
public class Demo2 {

    public static void main(String[] args) {

        /**
         * Here we can see lambda-syntax. As Runnable is functional
         * (has only one method to implement) - we can simply use
         * lambda function with body
         */
        Runnable t = () -> {

            try {
                System.out.println("st: " + Thread.currentThread());
                Thread.sleep(3000);
                System.out.println("end: " + Thread.currentThread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(t).start();
        mainThreadDelay();
        new Thread(t).start();
        mainThreadDelay();
        new Thread(t).start();
    }

    public static void mainThreadDelay() {

        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



