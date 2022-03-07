
public class ProducerConsumer {

    public static void main(String[] args) {

        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        new Thread(producer).start();
        
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {}

        new Thread(consumer).start();
    }
}

class Consumer implements Runnable {

    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    public void run() {

        for (int i = 0; i < 5; i++) {
            store.get();
        }
    }
}

class Store {

    private int product = 0;

    public synchronized void get() {

        while (product < 1) {

            try {
                wait();
            } catch (InterruptedException e) {}
        }
        product--;
        System.out.println("Consumer has bought 1 product");
        System.out.println("There is " + product + " at the store");
        notify();
    }

    public synchronized void put() {

        while (product >= 3) {

            try {
                wait();
            } catch (InterruptedException e) {}
        }
        product++;
        System.out.println("Producer has added 1 product to the store");
        System.out.println("There is " + product + " at the store");
        notify();
    }
}

class Producer implements Runnable {

    Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run() {

        for (int i = 0; i < 5; i++) {
            store.put();
        }
    }
}

