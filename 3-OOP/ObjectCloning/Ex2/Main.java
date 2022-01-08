
/**
 * Demonstrates that "super.clone()" doesn't do
 * 'deep' clone of instance.
 */
public class Main {

    public static void main(String[] args) {

        D d = new D("First instance of D");

        C c1 = new C(d);
        
        try {
            
            C c2 = c1.clone();
            C c3 = c2.clone();

            c1.printYourself();
            c2.printYourself();
            c3.printYourself();

            // !!! we change only
            d.setSt("Object changed");
            
            c1.printYourself();
            c2.printYourself();
            c3.printYourself();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class C implements Cloneable {

    private D field;

    public C(D d) {
        field = d;
    }

    @Override
    protected C clone() throws CloneNotSupportedException {
        return (C) super.clone();
    }

    @Override
    public String toString() {
        return
            String.format("[%s][%s]", 
                super.toString(),
                field.toString());
    }

    public void printYourself() {
        System.out.println(toString());
    }
}

class D {

    private String st;

    public D(String s) {
        st = s;
    }

    public void setSt(String s) {
        st = s;
    }

    @Override
    public String toString() {
        return super.toString()
         + "[" + st + "]";
    }
}
