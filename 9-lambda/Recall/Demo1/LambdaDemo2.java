
public class LambdaDemo2 {

    public static void main(String[] args) {

        MyClass myObject = new MyClass();

        MyFunctionalInterface m1 = () -> 245;
        MyFunctionalInterface m2 = () -> -22;

        MyFunctionalInterface m3 = MyClass::getTen;
        MyFunctionalInterface m4 = myObject::getTwenty;

        ConsolePrinter console = o -> System.out.println(o);

        console.out(m1.execute());
        console.out(m2.execute());
        console.out(m3.execute());
        console.out(m4.execute());
    }
}

interface MyFunctionalInterface {
    public int execute();
}

interface ConsolePrinter {
    public void out(Object o);
}

class MyClass {

    public static int getTen() {
        return 10;
    }

    public int getTwenty() {
        return 20;
    }
}

