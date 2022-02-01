
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;

public class ConsumerDemo1 {

    public static void main(String[] args) {

        ArrayList<IntHolder> list = new ArrayList<>(2);

        list.add(new IntHolder(20));
        list.add(new IntHolder(30));
        list.add(new IntHolder(50));

        System.out.println(list);
        accept(n -> n.setI(n.getI() * 2), list);
        System.out.println(list);
        accept(n -> n.setI(n.getI() / 4), list);
        System.out.println(list);
    }

    private static <T> void accept(Consumer<T> consumer, ArrayList<T> list) {

        list.forEach(consumer);
    }
}

class IntHolder {

    private int i;

    public IntHolder(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return String.format("[%s, i=%s]", hashCode(), i);
    }
}


