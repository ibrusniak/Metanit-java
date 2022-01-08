import java.nio.channels.IllegalSelectorException;

public class ExeptionsDemo {

    public static void main(String[] args) {

        try {
            
            long base = Long.parseLong(args[0]);
            long factorial = factorial(base);
            System.out.println("factorial is: " + factorial);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }

    public static long factorial(long base) throws IllegalArgumentException {

        if (base < 0) {
            throw new IllegalArgumentException("Base can't be less than zero!");
        }
        if (base == 1) {
            return 1;
        } else {
            return base * factorial(base - 1);
        }
    }
}
