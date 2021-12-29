
public class Demo1 {

    public static void main(String[] args) {
        
        SomeClass1 sc = new SomeClass1();
        System.out.println(sc.getT());

        SomeClass2<Float> sc2 = new SomeClass2<Float>(2.2f);
        System.out.println(sc2.getT());
    }
}

interface Interface1<T> {

    T getT();
}

class SomeClass1 implements Interface1<String> {

    @Override
    public String getT() {
        return "String 1";
    }
}

class SomeClass2<T> implements Interface1<T> {

    T t;

    public SomeClass2(T t) {
        this.t = t;
    }

    @Override
    public T getT() {
        return t;
    }
}


