
public class PseudoGenericDemo0 {

    public static void main(String[] args) {
        PseudoGeneric pg1 = new PseudoGeneric(20);
        PseudoGeneric pg2 = new PseudoGeneric("String");
        PseudoGeneric pg3 = new PseudoGeneric(30.02D);
        print(pg1);
        print(pg2);
        print(pg3);
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}

class PseudoGeneric {

    private Object obj;

    public PseudoGeneric(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return super.toString()
            + ", \"obj\" type is: " + obj.getClass().getName();
    }
}

