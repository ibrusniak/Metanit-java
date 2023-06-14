package chapter8.example10;

public class SomeClass {
    private int i;
    
    public SomeClass(int i) {this.i = i;}
    public int getI() {return i;}
    public void setI(int i) {this.i = i;}
    @Override
    public String toString() {
        return String.format("[%s@%s][i=%d]",
            getClass().getSimpleName(),
            hashCode(), i);
    }
}