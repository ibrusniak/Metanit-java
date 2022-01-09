
import java.util.ArrayList;

/**
 * Main.java. Demonstrates common operations
 * with collections.
 * 
 */
public class Main {

    public static void main(String[] args) {
        
        ArrayList<Testable> tests = new ArrayList<>(20);

        tests.add(new ArrayListTest1());

        Tester<Testable> tester = new Tester<>(tests);
        tester.runAllTests();
    }
}

class Tester<T extends Testable> {

    private ArrayList<T> tests;

    public Tester(ArrayList<T> tests) {
        this.tests = tests;
    }

    public void runAllTests() {
        for(T test : tests) {
            test.run();
        }
    }
}

interface Testable {

    public void run();

    default void println(String pattern, Object... args) {
        System.out.printf(pattern, args);
    }

    default <O> void println(O object) {
        System.out.println(object);
    }

    default void lf() {
        System.out.println();
    }
}

class ArrayListTest1 implements Testable {

    @Override
    public void run() {

        ArrayList<Integer> list = new ArrayList<>(10);

        lf();
        println(list.size()); // 0
        println(list.isEmpty());

        for(int i = 76; i > 30; i--) {
            list.add(i);
        }

        println(list.size());
        println(list.get(0));
        lf();
    }
}
