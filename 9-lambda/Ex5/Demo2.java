
public class Demo2 {

    public static void main(String[] args) {

        Printer printer = new Printer();

        FunctionalInterface0 method1 = printer::print1;
        FunctionalInterface0 method2 = printer::print2;

        method1.doSomething("foo");
        method2.doSomething("bar");
    }
}

interface FunctionalInterface0 {
    public <T> void doSomething(T arg);
}

class Printer {

    public <T> void print1(T arg) {
        System.out.println("1 [" + arg + "]");
    }

    public <T> void print2(T arg) {
        System.out.println("2 [" + arg + "]");
    }
}

