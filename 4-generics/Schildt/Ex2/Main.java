
public class Main {

    public static void main(String[] args) {
        
        // Note: Main.java uses unchecked or unsafe operations.
        C c1 = new C(10); // raw-type
        System.out.println(c1.getField());

        // Normal parametrized type
        C<Integer> c2 = new C<>(11);
        C<Float> c3 = new C<Float>(3.4f);
        System.out.println(c2.getField());
        System.out.println(c3.getField());

        System.out.println();

        D<Byte> d1 = new D<>();
        double avg = d1.average(new Byte[] { 2, 3, 4, 20 });
        System.out.println(avg);
    }
}

class C<V> {

    private V field;

    public C(V f) {
        field = f;
    }

    public V getField() {
        return field;
    }
}

interface I1<V extends Number> {

    public Double average(V[] args);
}

class D<T extends Number> implements I1<T> {

    public Double average(T[] args) {
        
        Double sum = 0.0;
        for(T t : args) {
            sum += t.doubleValue();
        }
        return sum / args.length;
    }
}

