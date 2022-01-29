public class TryLambda1 {
    
    public static void main(String[] args) {
        
        FunctionalInterface1 lambda1 = (x, y) -> x + y;
        FunctionalInterface1 lambda2 = (x, y) -> x - y;
        FunctionalInterface1 lambda3 = (x, y) -> x * y;

        Printable printer = (o) -> System.out.println(o);

        printer.print(lambda1.doSomeThing(20, 30));
        printer.print(lambda2.doSomeThing(20, 30));
        printer.print(lambda3.doSomeThing(20, 30));
    }
}

interface FunctionalInterface1 {

    public int doSomeThing(int a, int b);
}

interface Printable {

    public void print(Object o);
}

