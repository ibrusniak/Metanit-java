import java.util.ArrayList;
import java.util.Iterator;

public class AnonymousClassDemo1 {

    public static void main(String[] args) {
        ArrayList<Interface0> l = new ArrayList<>(5);
        l.add(new Interface0() {});
        l.add(new Interface0() {});
        l.add(new Interface0() {});
        l.add(new Interface0() {
            public void  execute() {
                System.out.println("\nThis is not default implementation!");
            }
        });
        Iterator<Interface0> it = l.iterator();
        while (it.hasNext()) {
            (it.next()).execute();
        }
    }
}

interface Interface0 {

    public default void execute() {
        System.out.printf("\n`execute` of the %s has executed\n", this);
    };
}


