
public class RunnableLambda0 {

    public static void main(String[] args) {

        // Use anonymous class
        Thread t1 = new Thread(new Runnable(){
            public void run() {
                System.out.println("1. Running...");
            }
        });
        t1.start();

        // Use lambda function
        Thread t2 = new Thread(() -> System.out.println("2. Running..."));
        t2.start();
    }
}

