
public class Ex0 {

    public static void main(String[] args) {

        Functional f1 = MyClass0::doSmth;
        f1.doSomethingElse();
        System.out.println(f1);
        Functional2 f2 = Ex0::main;
        // Stack overflow exception
        f2.main(new String[]{""});
    }
}

class MyClass0 {
    
    static void doSmth() {
        System.out.println("MyClass.doSmth()");
    }
}

interface Functional {
    public void doSomethingElse();
}

interface Functional2 {
    public void main(String[] args);
}

