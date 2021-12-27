
public class Test3 {

    public static void main(String[] args) {
        
        ParentInterface p1 = new Class1();
        ChildInterface ch1 = new Class1();

        // Instance of Class1
        p1.printInfoParentInterface(); 
        ch1.printInfoParentInterface();
        ch1.printInfoChildInterface();

        // Explicit
        ((Class1)p1).printInfoChildInterface();
    }
}

interface ParentInterface {

    void printInfoParentInterface();
}

interface ChildInterface extends ParentInterface {

    void printInfoChildInterface();
}

class Class1 implements ChildInterface {

    public void printInfoParentInterface() {
        System.out.printf("Instance of %s\n", this.getClass().getSimpleName());
    }

    public void printInfoChildInterface() {
        System.out.printf("Instance of %s\n", this.getClass().getSimpleName());
    }
}

