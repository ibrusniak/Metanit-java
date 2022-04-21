
public class ClassicProducerConsumerDemo {

    public static void main(String[] args) {
        Store store = new Store(6);
        new Producer(store).start();
        new Consumer(store).start();
    }
}


class Producer extends Thread {

    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (!interrupted()) {
         synchronized (store) {
               if (store.getCount() < store.getCapacity()) {
                    store.add();
                    System.out.printf(
                        "\n%s has added one item to the store. Now in the store is %s\n",
                        currentThread().getName(), store.getCount());
                    try {
                        sleep(550);
                    } catch (InterruptedException e) {}
                } else {
                    try {
                        store.wait();
                    } catch (InterruptedException e) {}
                }
            }
        }
    }
}

class Consumer extends Thread {

    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (!interrupted()) {
            synchronized (store) {
                if (store.getCount() > 0) {
                    store.get();
                    System.out.printf(
                        "\n%s has gatted one item from the store. Now in the store is %s\n",
                        currentThread().getName(), store.getCount());
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {}
                } else {
                    System.out.printf(
                        "\nInsufficient quantity at the store. %s is waiting for consumer\n",
                        currentThread().getName());
                    store.notify();
                }
            }
        }
    }
}

class Store {

    private int capacity;
    private int count;

    public Store(int capacity) {
        this.capacity = capacity;
        count = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCount() {
        return count;
    }

    public void add() {
        count++;
    }

    public void get() {
        count--;
    }
}


