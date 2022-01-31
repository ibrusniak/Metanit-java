
public class MethodReferenceDemo {

    public static void main(String[] args) {

        SomeClass0 s0 = new SomeClass0();

        FunctionalInterface0 f0 = s0::method0;
        FunctionalInterface0 f1 = s0::method1;
        FunctionalInterface0 f2 = s0::method2;

        method0(f0, f1, f2);
    }

    private static void method0(FunctionalInterface0... methods) {

        for (FunctionalInterface0 f : methods)
            f.someMethod();
    }
}

interface FunctionalInterface0 {
    public void someMethod();
}

class SomeClass0 {

    public void method0() {
        System.out.println("method 1");
    }

    public void method1() {
        System.out.println("method 2");
    }

    public void method2() {
        System.out.println("method 3");
    }
}


