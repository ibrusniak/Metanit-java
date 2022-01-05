
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

        Parrent<Integer> p2 = new Child2<Integer, String>(20, "bar");
        System.out.println(p2.getT());
        System.out.println(((Child2)p2).getW());
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

class Child2<T, W> extends Parrent<T> {

    private W w;

    public Child2(T t, W w) {
        super(t);
        this.w = w;
    }

    public W getW() {
        return w;
    }
}


