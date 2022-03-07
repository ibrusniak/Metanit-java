
public class SynchronizedDemo1 {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            new JThread().start();
        }
    }
}

class ResourceWithStaticMethod {

    public static void staticDoSomething() {
        
        System.out.println("The method staticDoSomething has started");
        try {
            Thread.currentThread().sleep(2000);
        } catch (Exception e) {}
        System.out.println("The method staticDoSomething has ended");
    }
}

class JThread extends Thread {

    @Override
    public void run() {

        synchronized (new Object()) {

            ResourceWithStaticMethod.staticDoSomething();
        }
    }
}

