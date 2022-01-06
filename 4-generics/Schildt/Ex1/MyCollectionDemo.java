import java.util.function.IntFunction;

public class MyCollectionDemo {


    public static void main(String[] args) {
        
        MyCollection col = new MyCollection();
        col.setItem(0, 100);
        col.addItem(5.56d);
        System.out.println(col);
        col.setItem(0, true);
        System.out.println(col);
    }
}

class MyCollection {

    private Object[] items;

    public MyCollection() {
        
        items = new Object[]{0};
    }

    public MyCollection(int capacity) {

        items = new Object[capacity];
        for(int i = 0; i < items.length; i++) {
            items[i] = 0;
        }
    }

    public boolean setItem(int index, Object item) {
        
        if(index < 0 || index > items.length - 1) {
            return false;
        } else {

            items[index] = item;
            return true;
        }
    }

    public void addItem(Object item) {
        
        Object[] newItems = new Object[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[i];
        }
        newItems[newItems.length - 1] = item;
        items = newItems;
    }

    @Override
    public String toString() {

        String s = "";
        for (int i = 0; i < items.length; i++) {
            s += String.format("[%s]", items[i].toString());
        }
        return s;
    }
}

