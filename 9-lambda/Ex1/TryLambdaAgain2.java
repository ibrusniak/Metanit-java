
public class TryLambdaAgain2 {

    public static void main(String[] args) {
        
        Calculable<Integer, Integer> mult = (n) -> n * 3;
        
        Calculable<String, String> reverse = (s) -> {

            String reversed = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                reversed += s.charAt(i);
            }
            return reversed;
        };

        Printable printer = (object) -> System.out.println(object);

        printer.print(reverse.calculate("argument"));

        printer.print(mult.calculate(200));
    }
}

interface Calculable<E, F> {
    public E calculate (F argument);
}

interface Printable {
    public void print(Object object);
}

