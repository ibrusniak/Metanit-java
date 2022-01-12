import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.sound.midi.MidiSystem;

public class UseComparator {

    public static void main(String[] args) {
        
        List<IntegerStorage> myList = new ArrayList<>();
        myList.add(new IntegerStorage(200));
        myList.add(new IntegerStorage(1000));
        myList.add(new IntegerStorage(500));
        myList.add(new IntegerStorage(100));
        myList.add(new IntegerStorage(900));

        System.out.println(myList);

        myList.sort(new MyComparator1());
        System.out.println(myList);
        myList.sort(new MyComparator2Reverse());
        System.out.println(myList);
    }
}

class MyComparator1 implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        
        int i1 = ((IntegerStorage)o1).getI();
        int i2 = ((IntegerStorage)o2).getI();

        if (i1 < i2) {
            return -1;
        } else if (i1 > i2) {
            return 1;
        } else {
            return 0;
        }
    }
}

class MyComparator2Reverse implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        
        int i1 = ((IntegerStorage)o1).getI();
        int i2 = ((IntegerStorage)o2).getI();

        if (i1 < i2) {
            return 1;
        } else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        }
    }
}

class IntegerStorage {

    private Integer i;

    public IntegerStorage(Integer i) {
        this.i = i;
    }

    public Integer getI() {
        return i;
    }

    @Override
    public String toString() {
        return super.toString() + " [" + i + "]";
    }
}


