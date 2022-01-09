
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
        tests.add(new ArrayListTest2());

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

class ArrayListTest2 implements Testable {

    @Override
    public void run() {

        lf();
        println("Use addAll(Collection<? extends E> col)");

        ArrayList<Number> al1 = new ArrayList<>();

        ArrayList<Float> al2 = new ArrayList<>();
        al2.add(2.3f);
        al2.add(0.24f);

        al1.addAll(al2);
        println(al1);
        println(al2);

        lf();
        al1.add(33f);
        al1.add(40f);

        println(al1);
        al1.retainAll(al2);
        println(al1);
        al1.remove(2.3f);
        println(al1);
        al1.clear();
        println(al1);

        lf();
    }
}
