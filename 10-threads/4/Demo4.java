
import java.util.function.Supplier;

public class Demo4 {

    public static void main(String[] args) {

        Supplier<Runnable> rSupplier = () -> {

            Runnable r = () -> {

                System.out.println("st " + Thread.currentThread());
                try {
                    int a = 1 / 0;
                } catch (Exception e) {
                    System.out.println("interrupted");
                }
            };

            return r;
        };
    
        Runnable r = rSupplier.get();
        Thread t = new Thread(r);
        echo("st " + Thread.currentThread());
        try {
            echo(t.interrupted());
            t.start();
        } catch (Exception e) {
            echo("Exception!");
            echo(t.interrupted());
            echo(e);
        }

        echo(t.interrupted());
    }

    private static void echo(Object o) {
        System.out.println(o);
    }
}



