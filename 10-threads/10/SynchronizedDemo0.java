
public class SynchronizedDemo0 {

    public static void main(String[] args) {

        Resource commonResource = new Resource();

        for (int i = 0; i < 3; i++) {
            new JThread0(commonResource).start();
        }

        for (int i = 0; i < 3; i++) {
            new JThread1(commonResource).start();
        }
    }
}

class Resource {

    public static void staticDoSomething() {

        System.out.println("staticDoSomething start");
        try {
            Thread.currentThread().wait(2000);
        } catch (Exception e) {}
        System.out.println("staticDoSomething end");
    }

    public void doSomething() {

        System.out.println("doSomething start");
        try {
            Thread.currentThread().sleep(2000);
        } catch (Exception e) {}
        System.out.println("doSomething end");
    }
}

class JThread0 extends Thread {

    private Resource r;

    public JThread0(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {

        synchronized (r) {
            r.doSomething();
        }
    }
}

class JThread1 extends Thread {

    private Resource r;

    public JThread1(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {

        synchronized (r) {
            Resource.staticDoSomething();
        }
    }
}


