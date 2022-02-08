
public class Demo0 {

    public static void main(String[] args) {

        Server s = new Server();

        s.start();

        try {
            Thread.currentThread().sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        s.stopServer();

        try {
            Thread.currentThread().sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();

        // s.start(); // IllegalThreadStateException

        s = new Server();

        s.start();

        try {
            Thread.currentThread().sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        s.stopServer();
    }
}

class Server extends Thread {

    private boolean isActive;

    public Server() {
        isActive = true;
    }

    public void stopServer() {
        isActive = false;
    }

    @Override
    public void run() {

        isActive = true;

        System.out.printf("Server started %s\n", this);

        try {
            while (isActive) {

                System.out.println("Server works");
                sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.printf("Server stopped %s\n", this);
    }
}
