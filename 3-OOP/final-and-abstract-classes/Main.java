
public class Main {

    public static void main(String[] args) {
        
        AbstractClass1 ch1 = new Child1();
        System.out.println(ch1);
        ch1.doSomething();
    }
}

abstract class AbstractClass1 {

    final void doSomething() {
        System.out.println("A. Done...");
    }
}

class Child1 extends AbstractClass1 {

    // Cannot override the final method
    // from AbstractClass1
    // @Override void doSomething() {}
}

final class FinalClass1 {}

// Error: cannot inherit from final FinalClass1
// class Child2 extends FinalClass1 {}

