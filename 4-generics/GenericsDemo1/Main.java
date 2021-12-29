
public class Main {

    public static void main(String[] args) {

        SomeClass1 object1 = new SomeClass1("str_ident_1");
        SomeClass1 object2 = new SomeClass1(200);

        System.out.println(object1.getIdentifier());
        System.out.println(object2.getIdentifier());

        // Normal
        int ident2 = (int)object2.getIdentifier();

        try {
            // Exception. Class cast
            int ident1 = (int)object1.getIdentifier();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        SomeClass2<Integer> object3 = new SomeClass2<Integer>(100);
        SomeClass2<Float> object4 = new SomeClass2<Float>(200.344f);
        SomeClass2<String> object5 = new SomeClass2<String>("ident_444");

        System.out.println(object3.getId());
        System.out.println(object4.getId());
        System.out.println(object5.getId());
    }
}

class SomeClass1 {
    
    Object identifier;

    SomeClass1(Object identifier) {
        this.identifier = identifier;
    }
    
    public Object getIdentifier() {
        return identifier;
    }
}

class SomeClass2<T> {

    private T id;

    SomeClass2(T id) {
        this.id = id;
    }

    public T getId() {
        return this.id;
    }
}

