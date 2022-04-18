
import java.util.concurrent.Exchanger;

public class ExchangerDemo0 {

    public static void main(String[] args) {
        Exchanger<String> pipe = new Exchanger<>();
        for(int i = 0; i < 2; i++) {
            new Thread(new Worker("Worker_" + i, pipe)).start();
        }
    }
}

class Worker implements Runnable {

    private Exchanger<String> pipe;
    private String currentThreadName;

    public Worker(String name, Exchanger<String> pipe) {
        this.currentThreadName = name;
        this.pipe = pipe;
    }

    public void run()  {
        Thread.currentThread().setName(currentThreadName);
        String InputMessage = "";
        String OutputMessage = "Hello from thread " + currentThreadName;
        System.out.printf("I am %s and i trying to send a message: [%s]\n",
            currentThreadName, OutputMessage);
        try {
            InputMessage = pipe.exchange(OutputMessage);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("I am %s and i has received a message: [%s]\n",
            currentThreadName, InputMessage);
    }
}

