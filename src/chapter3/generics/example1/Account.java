package chapter3.generics.example1;

public class Account <T> {
    private double balance;
    private Currency currency;
    private T id;

    public Account(T id, Currency currency, double initialBalance) {
        this.id = id;
        this.currency = currency;
        balance = initialBalance;
    }
    public T getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
}