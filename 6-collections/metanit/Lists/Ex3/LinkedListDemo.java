
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(20, 30, 60));
        printToConsole(arrayList1);
        printEmptyLine();
        LinkedList<Double> linkedList1 = new LinkedList<>(Arrays.asList(2.3, 5d, 20.34));
        printToConsole(linkedList1);
        linkedList1.add(80.35);
        printToConsole(linkedList1);
        linkedList1.addFirst(8.5);
        printToConsole(linkedList1);
        linkedList1.addLast(3.304);
        printToConsole(linkedList1);
        printToConsole(linkedList1.remove());
        printToConsole(linkedList1);
    }

    public static <E> void printToConsole(E object) {
        System.out.println(object);
    }

    public static <E> void printEmptyLine() {
        System.out.println();
    }
}



