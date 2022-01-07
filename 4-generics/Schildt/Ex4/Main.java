/**
 * Demonstrates how generic class can
 * provide type-safety
 */
public class Main {

    public static void main(String[] args) {
        
        PseudoGenericClass pg0 = new PseudoGenericClass(100);
        PseudoGenericClass pg1 = new PseudoGenericClass(3.4f);
        PseudoGenericClass pg2 = new PseudoGenericClass(new Object());

        try {
            
            // Normal...
            int v = (int)(pg0.getPrivateField());
            float f = (float)(pg1.getPrivateField());

            System.out.println(v); // 100
            System.out.println(f); // 3.4

            // Normal...
            pg2 = pg1;

            System.out.println(pg2.getPrivateField()); // 3.4

            System.out.println("***");

            // compilation OK!
            // But exception (classcast) in runtime!
            int q = (int)(pg2.getPrivateField());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        GenericClass<Integer> g1 = new GenericClass<>(20);
        GenericClass<Float> g2 = new GenericClass<>(3.14f);
        GenericClass<Object> g3 = new GenericClass<>(new Object());

        System.out.println("***");

        // COMPILATION ERROR!
        // error: incompatible types:
        //    GenericClass<Object> cannot be converted to GenericClass<Integer>
        // g1 = g3;

        // COMPILATION ERROR!
        // incompatible types: Float cannot be converted to int
        // int d = (int)g2.getPrivateField();
    }
}

class PseudoGenericClass {

    private Object privateField;

    public PseudoGenericClass(Object o) {
        privateField = o;
    }

    public Object getPrivateField() {
        return privateField;
    }
}

class GenericClass<Type> {

    private Type privateField;

    public GenericClass(Type t) {
        privateField = t;
    }

    public Type getPrivateField() {
        return privateField;
    }
}

