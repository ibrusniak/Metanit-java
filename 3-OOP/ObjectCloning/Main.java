
public class Main {

    public static void main(String[] args) {
        
        C1 inst1 = new C1("first instance");
        
        try {
            C1 inst2 = inst1.clone();
            inst1.printYourself();
            inst2.printYourself();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class C1 implements Cloneable {

    private String st;
    
    public C1(String s) {
        st = s;
    }

    @Override
    public String toString() {

        return
            String.format("[%s][%s][%s]",
                getClass().getName(),
                Integer.toHexString(hashCode()),
                st);
    }

    @Override
    protected C1 clone() throws CloneNotSupportedException {
        return (C1)super.clone();
    }

    public void printYourself() {
        System.out.println(this);
    }
}

