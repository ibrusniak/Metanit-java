
public class WaitDemo2 {

    public static void main(String[] args) {
        System.out.println("one");
        new Resource().doSmth(); // main thread waiting for 3 sec
        System.out.println("two");
    }
}

class Resource {

    public synchronized void doSmth() {
        try {
            wait(3000);
        } catch (InterruptedException e) {}
    }
}


