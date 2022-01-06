
public class GenericTest1 {

    public static void main(String[] args) {
        
        GenericClass<Integer> gc1 = new GenericClass<Integer>(10);

        // warning: [unchecked] unchecked call
        // to GenericClass(T) as a member of the raw type GenericClass
        GenericClass gc2 = new GenericClass(new Object());

        // java.lang.Object@*******
        System.out.println(gc2.getT());
    }
}

class GenericClass<T> {

    private T t;

    public GenericClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}

