
public class RunnableDemo2 {

    public static void main(String[] args) {

        Runnable f1 = () -> System.out.println(Thread.currentThread());

        new Thread(f1).start();

        new Thread(() -> {

            try {
                System.out.println(Thread.currentThread());
                Thread.currentThread().sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();
    }
}


