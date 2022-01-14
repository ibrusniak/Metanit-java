import java.util.ArrayList;
import java.util.Collection;

public class Test2 implements RunnableTest {

    public void runTest() {

        showTestInfo("Use interface java.util.Collection");

        Collection<Integer> myCollection = new ArrayList<>();

        myCollection.add(100);
        myCollection.add(200);
        myCollection.add(50);

        Collection<Integer> myCollection2 = new ArrayList<>(myCollection);

        myCollection2.add(20);
        myCollection2.add(25);

        toConsole(myCollection);
        toConsole(myCollection2);
    }
}


