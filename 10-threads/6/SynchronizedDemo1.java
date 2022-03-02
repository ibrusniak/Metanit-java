
public class SynchronizedDemo0 {

    public static void main(String[] args) {

        Account a = new Account(150);
        Account b = new Account(200);
        
        System.out.println(a);
        System.out.println(b);

        // syncronized method

        // sent 100 from a to b
        // begin transaction
        a.set(a.get() - 100);
        b.set(b.get() + 100);
        
        System.out.println(b);
        System.out.println(a);

        System.out.println();

        a.set(150);
        b.set(100);

        System.out.println();

        System.out.println(a);
        System.out.println(b);

        // unsynchronized method
        MoneySenderUnsynchronized ms1 = new MoneySender(a, b, 100);
        MoneySenderUnsynchronized ms2 = new MoneySender(a, b, 30);
        
        ms1.start();
        ms2.start();

        try {
            ms1.join();
            ms2.join();
        } catch (InterruptedException e) {
        }

        System.out.println(a);
        System.out.println(b);
    }
}

class Account {

    private int amount;

    public Account(int amount) {
        this.amount = amount;
    }

    public int get() {
        return amount;
    }

    public void set(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + amount;
    }
}

class MoneySenderUnsynchronized extends Thread {

    private Account a, b;
    private int amount;

    public MoneySender(Account from, Account to, int amount) {
        a = from;
        b = to;
        this.amount = amount;
    }

    public void run() {
        a.set(a.get() - amount);
        b.set(b.get() + amount);
    }
}



