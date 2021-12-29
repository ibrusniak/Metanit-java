
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

