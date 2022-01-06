
public class GenericClass {

    public static void main(String[] args) {
        
        Class1<String, Character> obj1 =
            new Class1<String, Character>("String content", 'A');
        
        Class1<Integer, Float> obj2 =
            new Class1<Integer, Float>(1000, 2.2f);

        obj1.showInstanceInfo();
        obj2.showInstanceInfo();
    }
}

class Class1<T, V> {

    private T t;
    private V v;

    public Class1(T t, V v) {

        this.t = t;
        this.v = v;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setV(V v) {
        this.v = v;
    }

    public V getV() {
        return v;
    }

    public void showInstanceInfo() {
        System.out.printf("\n[%s][%s]\n[%s][%s]\n",
            t.getClass().getName(), t,
            v.getClass().getName(), v);
    }
}

