
public class Test2 {

    public static void main(String[] args) {
        
        Class2 cl2 = new Class2(new Class1());
        cl2.doSomething();

        // Anonymous class!
        Class2 cl3  = new Class2(new Interface() {

            @Override
            public void doSomething() {
                System.out.println("Anonymous class. doSomething()");
            }
        });

        cl3.doSomething();
    }
}

interface Interface {

    public void doSomething();
}

class Class1 implements Interface {

    @Override
    public void doSomething() {
        System.out.println("Class1. doSomething()");
    }
}

class Class2 {

    private Interface iface;

    Class2(Interface iface) {
        this.iface = iface;
    }

    public void doSomething() {
        iface.doSomething();
    }
}

