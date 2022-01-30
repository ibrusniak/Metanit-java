
public class Demo2 {

    public static void main(String[] args) {
        
        someMethod((new Class0())::doSomething3);
        someMethod((new Class0())::doSomething1);
        someMethod((new Class0())::doSomething2);
    }

    private static void someMethod(FunctionalInterface arg) {
        arg.doSomething();
    }
}

interface FunctionalInterface {
    public void doSomething();
}

class Class0 {

    public void doSomething1() {
        System.out.println("Do something #1");
    }

    public void doSomething2() {
        System.out.println("Do something #2");
    }

    public void doSomething3() {
        System.out.println("Do something #3");
    }
}

