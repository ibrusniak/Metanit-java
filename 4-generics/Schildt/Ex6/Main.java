
public class Main {

    public static void main(String[] args) {
    
        System.out.println(
            altDoubleValue(new C<Integer>(200))
        );
        
        System.out.println(
            altDoubleValue(new C<Float>(5f))
        );

        System.out.println(
            altDoubleValue(new C<Byte>((byte)2))
        );
    }

    public static Double altDoubleValue(C<?> q) {
        
        return q.getV().doubleValue();
    }
}

class C<V extends Number> {

    private V v;

    public C(V v) {
        this.v = v;
    }

    public V getV() {
        return v;
    }
}


