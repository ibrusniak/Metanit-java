
import java.util.ArrayList;
import java.util.Iterator;

public class Demo0 {

    public static void main(String[] args) {

        ArrayList<JThread> threads = new ArrayList<>();

        threads.add(new JThread("A"));
        threads.add(new JThread("B"));
        threads.add(new JThread("C"));

        Iterator<JThread> iterator = threads.iterator();

        while(iterator.hasNext()) {
            iterator.next().start();
        }

        System.out.println();
    }
}

class JThread extends Thread {

    private String stringToPrint;

    public JThread(String s) {
        stringToPrint = s;
    }

    @Override
    public void run() {

        synchronized(System.out) {
            
            for (int i = 1; i < 5; i++) {

                System.out.print(" " + stringToPrint);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    break;
                }
            }
        }
    }
}

