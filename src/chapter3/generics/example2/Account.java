package chapter3.generics.example2;

public class Account<T> implements Accountable<T> {
    private int sum;
    private T id;

    Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public int getSum() {
        return sum;
    }
    public T getId() {
        return id;
    }
}