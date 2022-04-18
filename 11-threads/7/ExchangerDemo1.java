
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;

public class ExchangerDemo0 {

    public static void main(String[] args) {
        Exchanger<String> pipe = new Exchanger<>();
        ThreadSender sender = new ThreadSender(pipe);
        ThreadReceiver receiver = new ThreadReceiver(pipe);
        sender.start();
        receiver.start();
    }
}

class ThreadSender extends Thread {

    private Exchanger<String> pipe;

    public ThreadSender(Exchanger<String> pipe) {
        this.pipe = pipe;
    }

    @Override
    public void run() {
        try {
            sleep(2000);
            pipe.exchange("hello!", 1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        }
    }
}

class ThreadReceiver extends Thread {

    private Exchanger<String> pipe;

    public ThreadReceiver(Exchanger<String> pipe) {
        this.pipe = pipe;
    }

    @Override
    public void run() {
        try {
            System.out.printf("\nReceived message [%s]\n",
                pipe.exchange("", 1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        }
    }
}

