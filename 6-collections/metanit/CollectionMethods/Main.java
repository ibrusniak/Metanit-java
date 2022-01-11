
import java.lang.invoke.WrongMethodTypeException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.Iterator;

/**
 * 
 * Demonstrates java.util.Collection methods
 * 
 */
public class Main {

    public static void main(String[] args) {

        Item item1 = new Item(120);

        Collection<Item> linkedList1 = new LinkedList<>();
        Collection<Item> linkedList2 = new LinkedList<>();

        linkedList1.add(new Item(10));
        linkedList1.add(new Item(35));
        linkedList1.add(new Item(22));

        System.out.println(linkedList1);
        linkedList2.addAll(linkedList1);
        System.out.println(linkedList2);
        linkedList2.add(item1);
        System.out.println(linkedList2);

        Boolean list1ContainsItem1 = linkedList1.contains(item1);
        Boolean list2ContainsItem2 = linkedList2.contains(item1);

        System.out.printf("linkedList1  contains item1: %s\n", list1ContainsItem1);
        System.out.printf("linkedList2  contains item1: %s\n", list2ContainsItem2);

        Iterator<Item> list2Iterator = linkedList2.iterator();

        MyItemConsumer myConsumer = new MyItemConsumer();

        while(list2Iterator.hasNext()) {
            list2Iterator.forEachRemaining(myConsumer);
        }

        System.out.println(linkedList2);
        System.out.printf("linkedList2  size: %s\n", linkedList2.size());
    }
}

class MyItemConsumer implements Consumer<Item> {

    @Override
    public void accept(Item t) {
        t.setV(t.getV() * 3);
    }
}

class Item {

    private Integer v;

    public Item(Integer value) {
        v = value;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Integer getV() {
        return v;
    }

    @Override
    public String toString() {
        return
            String.format("{%s@%s}{%s}", getClass().getName(), hashCode(), v);
    }
}


