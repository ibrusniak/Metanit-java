
public class Test4 {

    public static void main(String[] args) {
        
        new Class1().printInfo();
        new Class2().printInfo();
    }
}

interface Interface1 {

    default void printInfo() {
        System.out.printf("%s (default method from Interface1)\n", getClass().getSimpleName());
    }
}

class Class1 implements Interface1 {

    // This one does not override default
    // method 'printInfo()' from inteface Interface1
}

class Class2 implements Interface1 {

    @Override
    public void printInfo() {
        Interface1.super.printInfo();
        System.out.printf("%s (overrided method from Class2)\n", getClass().getSimpleName());
    }
}

