
public class Test2 {

    public static void main(String[] args) {
        
        // Use simple access (through interface name)
        // to static fields of an interface
        toConsole(Interface1.x);
        toConsole(Interface1.y);

        // Call static method from interface
        Interface1.sayHello();
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
}

class Class1 implements Interface1 {


}

