
public class Demo0 {

    /**
     * Shows how to use static method refrences
     */
    public static void main(String[] args) {
        
        FunctionalInterface methodFoo = MyClass::printFoo;
        FunctionalInterface methodBaz = MyClass::printBaz;

        callableMethod(methodFoo);
        callableMethod(methodBaz);
    }

    private static void callableMethod(FunctionalInterface arg) {
        arg.printSomething();
    }
}

interface FunctionalInterface {
    public void printSomething();
}

class MyClass {

    public static void printFoo() {
        System.out.println("Foo");
    }

    public static void printBaz() {
        System.out.println("Bas");
    }
}

