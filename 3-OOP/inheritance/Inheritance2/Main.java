
public class Main {

    public static void main(String[] args) {
        new ChildClass();
    }
}

final class FinalClass {}

// error: cannot inherit from final FinalClass
// class ChildClass extends FinalClass {}

class ParentClass {

    public final void printInfo() {

        System.out.println("\"print()\" from ParentClass");
    }
}

class ChildClass extends ParentClass {

    public ChildClass() {
        printInfo();
    }

    // error: print() in ChildClass cannot override print() in ParentClass
    // @Override void print() {}
}

