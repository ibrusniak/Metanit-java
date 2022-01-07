/**
 * Demonstrates how generic class can
 * provide type-safety
 */
public class Main {

    public static void main(String[] args) {
        
        PseudoGeneric pg0 = new PseudoGeneric(100);
        PseudoGeneric pg1 = new PseudoGeneric(3.4f);
        PseudoGeneric pg2 = new PseudoGeneric(new Object());

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
    }
}

class PseudoGeneric {

    private Object privateField;

    public PseudoGeneric(Object o) {
        privateField = o;
    }

    public Object getPrivateField() {
        return privateField;
    }
}


