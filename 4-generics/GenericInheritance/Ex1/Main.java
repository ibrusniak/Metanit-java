
public class Main {

    public static void main(String[] args) {

        Parrent<Integer> p = new Child1<Integer>(15);
        Child1<String> ch = new Child1<String>("foo");
        System.out.println(p.getT());
        System.out.println(ch.getT());

        // incompatible types: Child1<Integer>
        // cannot be converted to Parrent<String>
        // Parrent<String> p2 = new Child1<Integer>(24);
        // System.out.println(p2.getT());
    }
}

class Parrent<T> {

    private T t;

    public Parrent(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}

class Child1<T> extends Parrent<T> {

    public Child1(T t) {
        super(t);
    }
}




