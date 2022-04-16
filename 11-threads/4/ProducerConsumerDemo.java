
public class ProducerConsumerDemo {

    public static void main(String[] args) {
        Store store = new Store(7);
        Producer producer = new Producer("Producer", store);
        Consumer consumer = new Consumer("Consumer", store);
        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {

    private Store store;

    public Producer(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        for(int i = 0; i < 20; i++) {
            store.add();
        }
    }
}

class Consumer extends Thread {

    private Store store;

    public Consumer(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        for(int i = 0; i < 20; i++) {
            store.get();
        }
    }
}

class Store {

    private int items = 0;
    private int maxItems = 0;

    public Store(int maxItems) {
        this.maxItems = maxItems;
    }

    public synchronized void add() {
        if (items == maxItems) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        items++;
        System.out.println(Thread.currentThread().getName()
            + " put 1 item to store. Now the store has: " + items);
        notify();
    }

    public synchronized void get() {
        if (items < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        items--;
        System.out.println(Thread.currentThread().getName()
            + " get 1 item from store. Now the store has: " + items);
        notify();
    }
}

