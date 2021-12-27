
public class Test1 {

    public static void main(String[] args) {
        
        // Cannot instantiate the type Interface1
        // Interface1 int1 = new Interface1();

        Interface1 int1 = new Class1();

        // All - true
        System.out.println("int1 instanceof Class1: " + (int1 instanceof Class1));
        System.out.println("int1 instanceof Interface1: " + (int1 instanceof Interface1));
        System.out.println("int2 instanceof Class1: " + (int1 instanceof Class1));
        System.out.println("int2 instanceof Interface2: " + (int1 instanceof Interface2));

        // Interface 'inheritance'
        // Warning: the static field 'intValue' should be
        // accessed in a static way
        System.out.println(int1.intValue);
        System.out.println(int1.STATIC_INT);
    }    
}

interface Interface1 {

    int intValue = 100;
    final static int STATIC_INT = 500;
}

interface Interface2 {}

class Class1 implements Interface1, Interface2 {}

