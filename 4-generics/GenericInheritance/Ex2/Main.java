
public class Main {

    public static void main(String[] args) {
        
        Parrent<String> obj1 = new Parrent<String>("foo");
        toCons(obj1.getT());

        Parrent<String> obj2 = new Child1<String>("bar");
        toCons(obj2.getT());

        Parrent<Float> obj3 = new Child3(3.22f);
        toCons(obj3.getT());
    }

    public static <Type> void toCons(Type object) {
        System.out.println(object);
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

class Child2 extends Parrent<String> {

    public Child2(String s) {
        super(s);
    }
}

class Child3 extends Parrent<Float> {

    public Child3(Float f) {
        super(f);
    }
}


