
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1 implements RunnableTest {

    public void runTest() {
        
        showTestInfo("Instantiating ArrayList");

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>(150);
        arrayList2.add(30);
        arrayList2.add(40);
        ArrayList<Integer> arrayList3 = new ArrayList<>(arrayList2);
        arrayList1.add(10);
        arrayList1.add(20);
        toConsole(arrayList1);
        toConsole(arrayList2);
        toConsole(arrayList3);
        List<Integer> arrayList4 = Arrays.asList(new Integer[]{15, 17, 19});
        toConsole(arrayList4.getClass().getName());
        toConsole(arrayList4);
    }
}


