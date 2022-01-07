
public class Main {

    public static void main(String[] args) {

        C<Integer> c1 = new C<>();
        C<Byte> c2 = new C<Byte>();

        // Incompatible!
        // Code doesn't compile
        // c1 = c2;
        // c1 = (C<Integer>)c2;
    }
}

class C<T> {}

