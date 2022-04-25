
public class UnsafePseudoGenericDemo0 {

    public static void main(String[] args) {

        Wrapper w1 = new Wrapper(200);
        Wrapper w2 = new Wrapper(300);
        Wrapper w3 = new Wrapper("String value");

        // Normal. Compiled and executed!
        Integer i1 = add(w1, w2);
        System.out.println(i1); // 500

        // Compiles bu causes run-time error
        w2 = w3;
        Integer s1 = add(w1, w2);
        System.out.println(s1);
    }

    private static Integer add(Wrapper w1, Wrapper w2) {
        return (Integer) w1.getObject()
            + (Integer) w2.getObject();
    }
}

class Wrapper {

    private Object object;

    public Wrapper(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
}


