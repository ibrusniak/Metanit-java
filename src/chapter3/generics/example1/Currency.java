package chapter3.generics.example1;

public enum Currency {
    USD(1),
    UAH(38);
    private int rate;
    Currency(int rate) { this.rate = rate; }
    public int getRate() { return rate; }
}