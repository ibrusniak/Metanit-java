
public class SyncDemo1 {

    public static void main(String[] args) {

        CommonResource c = new CommonResource();
        ResourceReader reader = new ResourceReader(c);
        ResourceWriter writer = new ResourceWriter(c);
        reader.start();
        writer.start();
    }
}

class CommonResource {

    public int x; // just for demo
}

class ResourceReader extends Thread {

    private CommonResource c;

    public ResourceReader(CommonResource c) {
        this.c = c;
    }

    @Override
    public void run() {

        int i = 0;
        while (++i < 20) {
    
            try {
                sleep(1000);
                System.out.println(currentThread() + " common resource is: " + c.x);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

class ResourceWriter extends Thread {
    
    private CommonResource c;
    
    public ResourceWriter(CommonResource c) {
        this.c = c;
    }
    
    @Override
    public void run() {
        
        int i = 0;
        while (++i < 30) {
        
            try {
                sleep(600);
                c.x += 5;
            } catch (InterruptedException e) {}
        }
    }
}
