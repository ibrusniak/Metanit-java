
// This file compiles with warning, but works:
// GenDemo2.java uses unchecked or unsafe operations.

public class GenDemo2 {

    public static void main(String[] args) {
        G g0 = new G(2);
        System.out.println(g0);
    }
}

class G<T> {

    private T obj;

    public G(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return super.toString() + " "
            + obj.getClass().getName();
    }
}


