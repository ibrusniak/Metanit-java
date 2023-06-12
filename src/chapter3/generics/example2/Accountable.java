package chapter3.generics.example2;

interface Accountable<T> {
    T getId();
    void setSum(int sum);
    int getSum();
}