
public class Demo1 {

    public static void main(String[] args) {
        
        SomeClass0 sc = new SomeClass0();

        Functional square = sc::square;

        printResult(3, square);
        printResult(4, sc::qube);
    }

    private static void printResult(double arg, Functional function) {
        System.out.println(function.execute(arg));
    }
}

interface Functional {
    public double execute(double arg);
}

class SomeClass0 {

    public double square(double arg) {
        return arg * arg;
    }

    public double qube(double arg) {
        return square(arg) * arg;
    }
}


