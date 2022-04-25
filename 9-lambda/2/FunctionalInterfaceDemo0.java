
import java.util.*;

public class FunctionalInterfaceDemo0 {

    public static void main(String[] args) {
        List<FunctionalInterface> list = new ArrayList<>();
        list.add(new Imlementator1());
        list.add(new Imlementator1());
        System.out.println(list);
        list.add(new FunctionalInterface() {
            public void someOperation() {
                System.out.println("Anonymous class 0");
            };
        });
        list.add(new FunctionalInterface() {
            public void someOperation() {
                System.out.println("Anonymous class 1");
            };
        });
        System.out.println(list);
        Iterator<FunctionalInterface> iterator =
            list.iterator();
        while(iterator.hasNext()) {
            iterator.next().someOperation();
        }
    }
}

interface FunctionalInterface {
    public void someOperation();
}

class Imlementator1 implements FunctionalInterface {

    public void someOperation() {
        System.out.printf("\nImplementation in %s\n",
            getClass().getName());
    }
}

