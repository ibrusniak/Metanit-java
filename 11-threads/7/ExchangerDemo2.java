
import java.util.concurrent.Exchanger;

public class ExchangerDemo2 {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Sender(exchanger).start();
        try {
            System.out.println("\nMain thread waiting for message via exchanger...");
            String message = exchanger.exchange("");
            System.out.println("Main thread has received msg: " + message);
        } catch (InterruptedException e) {}
    }
}

class Sender extends Thread {

    private Exchanger<String> exchanger;

    public Sender(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            sleep(7000);
            exchanger.exchange("Hello from thread" + currentThread().getName());
        } catch (InterruptedException e) {}
    }
}

