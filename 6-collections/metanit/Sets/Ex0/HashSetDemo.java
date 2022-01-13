
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        MyHashSet<String> hashSet1 = new MyHashSet<>();

        hashSet1.add("foo");
        hashSet1.add("bar");
        hashSet1.add("baz");

        hashSet1.add("foo");
    }

    
}

class MyHashSet<E> extends HashSet<E> {

    @Override
    public boolean add(E e) {
        
        boolean result = super.add(e);
        System.out.println("Trying to add object: " + e + ", success: " + result);
        return result;
    }
}



