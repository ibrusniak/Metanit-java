
public class Modifiers {
    
    public static void main(String[] args) {
        
        var m1 = new MyClass();
        prn(m1.q);
        prn(m1.y);
        prn(m1.z);

        var m2 = new MyClass2();
        prn(m2.showSome());
    }

    public static void prn(Object o) {

        System.out.println(o);
    }
}

class MyClass {

    private int x = 1;
    protected int y = 2;
    public int z = 3;
    int q = 4; // package access
}

class MyClass2 extends MyClass {

    public int showSome() {

        return q;
    }
}


