
public class BasicThreadFunctionalityDemo {

    public static void main(String[] args) {

        new UThread().start();
    }
}

class UThread extends Thread {

    @Override
    public void run() {

        System.out.println("start");
        try {
            currentThread().sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println("end");
    }
}

