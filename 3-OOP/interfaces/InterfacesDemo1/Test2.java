
public class Test2 {

    public static void main(String[] args) {
        
        // Use simple access (through interface name)
        // to static fields of an interface
        toConsole(Interface1.x);
        toConsole(Interface1.y);

        // Call static method from interface
        Interface1.sayHello();

        // We cannot use private methods (static or non-static)
        // from interface
        // error: doSomething1() has private access in Interface1
        // Interface1.doSomething1();

        // Interface1 int1 = new Class1();
        // int1.doSomething1();

        // Interface1 int2 = new Class1();
        // int2.doSomething2();
    }

    public static void toConsole(Object o) {
        System.out.printf("[%s]: %s\n", o.getClass().getSimpleName(), o);
    }
}

interface Interface1 {

    int x = 100;
    public final int y = 200;

    // Only public constants are allowed
    // private int z = 300;

    // From JDK 8 we can define static
    // methods into interface's
    public static void sayHello() {
        System.out.println("Hello from Interface's method with body");
    }

    // From JDK 9 we can define private static
    // and non static methods into interface
    private static void doSomething1() {
        System.out.println("private static method doSomething1()");
    }
    
    private void doSomething2() {
        System.out.println("private method doSomething2()");
    }
}

class Class1 implements Interface1 {

    // We cannot access to prvate methods from
    // class-implementator
    // public void doSomethingFromClass1() {

    //     doSomething1();
    //     doSomething1();
    // }
}

