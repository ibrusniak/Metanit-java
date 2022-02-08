

public class Demo2 {

    public static void main(String[] args) {
        
        Service t = new Service();
        t.start();

        try {

            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t.interrupt();
        System.out.println(t.interrupted());
    }
}

class Service extends Thread {

    @Override
    public void run() {

        try {
            System.out.println("going to sleep 10 sec");
            System.out.println(interrupted());
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println(interrupted());
            System.out.println("catch block");
            System.out.println(e.getMessage());
        }
        System.out.println("after try-block");
    }
}

