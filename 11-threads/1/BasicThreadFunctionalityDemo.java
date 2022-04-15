
public class BasicThreadFunctionalityDemo {

    public static void main(String[] args) {

        new UThread().start();
        
        Thread t0 = new UThread();
        System.out.println(t0);
        t0.setName("myThread0");
        System.out.println(t0);
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

