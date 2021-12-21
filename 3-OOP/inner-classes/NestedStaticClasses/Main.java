
public class Main {

    public static void main(String[] args) {
        
        Math.Factorial f = Math.getFactorial(5);
        f.printInfo();

        Math.Factorial f2 = new Math.Factorial(120, 5);
        f2.printInfo();
    }
}
