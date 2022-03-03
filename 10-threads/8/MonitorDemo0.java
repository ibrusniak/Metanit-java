
public class MonitorDemo0 {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            new JThread0().start();
        }
    }
}

class SomeClass0 {

    public static synchronized void staticSynchronizedMethod() {
        System.out.println(
            "Static synchronized method of SomeClass has called. Thread "
            + Thread.currentThread().getName());
    }
}

class JThread0 extends Thread {

    @Override
    public void run() {

        // this does not cause monitor blocking
        SomeClass0.staticSynchronizedMethod();
        try {
            sleep(5000);
        } catch (InterruptedException e) {}
    }
}


