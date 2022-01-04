
public class Main {

    public static void main(String[] args) {
        
        Class2<Class3> obj1 = new Class2<Class3>(new Class3());
        obj1.getT().doSomething1();
        obj1.getT().doSomething2();
    }
}

interface Interface1 {
    public void doSomething1();
}

interface Interface2 {

    default void doSomething2() {
        System.out.println("doSomething2 (default implementation)");
    };
}

class Class1 {}

class Class3 extends Class1 implements Interface1, Interface2 {

    @Override
    public void doSomething1() {
        System.out.println("doSomething1");
    }
}

class Class2<Type extends Class1 & Interface1 & Interface2> {

    private Type t;

    public Class2(Type t) {
        this.t = t;
    }

    public Type getT() {
        return t;
    }
}


