
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class ReentrantLockDemo1 {

    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class Store {
    
    private int product = 0;
    private ReentrantLock locker;
    private Condition condition;

    public Store() {
        locker = new ReentrantLock();
        condition = locker.newCondition();
    }

    public void put() {
        locker.lock();
        try {
            while (product >= 3) {
                condition.await();
            }
            product++;
            System.out.printf(
                "Producer has added one item. Now at the store is: %s\n",
                product);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
        }
    }

    public void get() {
        locker.lock();
        try {
            while (product < 1) {
                condition.await();
            }
            product--;
            System.out.printf(
                "Consumer has bought one item. Now at the store is: %s\n",
                product);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
        }
    }
}

class Producer implements Runnable {

    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            store.put();
        }
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

