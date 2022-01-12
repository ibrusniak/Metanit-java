
/**
 * Demo2.java Demonstrates generic class inharitance
 */
public class Demo2 {

    public static void main(String[] args) {
        
        ParrentGenericClass<String> obj1 = new Child1<>("foo");
        System.out.println(obj1);

        ParrentGenericClass<String> obj2 = new Child2("bar");
        System.out.println(obj2);
    }
}

class ParrentGenericClass<T> {

    private T t;

    public ParrentGenericClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}

class Child1<T> extends ParrentGenericClass<T> {

    public Child1(T t) {
        super(t);
    }
}

class Child2 extends ParrentGenericClass<String> {

    public Child2(String s) {
        super(s);
    }
}

