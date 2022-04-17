
public class MonitorDemo0 {

    public static void main(String[] args) {
        new MonitorDemo0().blockThread(5000);
    }

    public synchronized void blockThread(long millis) {
        try {
            wait(millis);
        } catch (InterruptedException e) {}
    }
}



