
public class Demo3 {

    public static void main(String[] args) {

        System.out.println();

        Account acc1 = new Account();
        Account acc2 = new Account();
        Account acc3 = new Account();

        printAll(acc1, acc2, acc3);

        acc1.addAmount(1000);
        acc2.addAmount(250);
        acc3.addAmount(3400);

        printAll(acc1, acc2, acc3);

        try {

            Account.TransferMoney(acc1, acc2, 500);
        } catch (Account.NotEnoughtMoney e) {
            System.out.println(e.getMessage());
        }

        printAll(acc1, acc2, acc3);

        try {

            Account.TransferMoney(acc1, acc2, 600);
        } catch (Account.NotEnoughtMoney e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printAll(Account... accounts) {

        System.out.println();
        for(Account a : accounts)
            System.out.println(a);
    }

}

class Account {

    private static int nextAvailableNo;

    private int accNo;
    private int amount;

    public Account() {

        nextAvailableNo++;
        accNo = nextAvailableNo;
        amount = 0;
    }

    @Override
    public String toString() {
        return
            String.format("[ACC %d: USD %d]", accNo, amount);
    }

    private int getAmount() {
        return amount;
    }

    public void addAmount(int amount) {
        this.amount += amount;
    }

    public void withDraw(int amount) throws NotEnoughtMoney {

        if (amount > this.amount) {
            throw new NotEnoughtMoney(String.format(
                "Coudn't withdraw money [%s] from [%s]. Amount is too big",
                amount, this));
        } else {
            this.amount -= amount;
        }
    }

    public static synchronized void TransferMoney(Account from, Account to, int amount) throws NotEnoughtMoney {

        from.withDraw(amount);
        to.addAmount(amount);
    }

    class NotEnoughtMoney extends Exception {

        public NotEnoughtMoney(String message) {
            super(message);
        }
    }
}

