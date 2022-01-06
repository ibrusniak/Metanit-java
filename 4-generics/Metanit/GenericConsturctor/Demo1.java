
public class Demo1 {

    public static void main(String[] args) {
        
        SomeClass1 s1 = new SomeClass1(2.22f);
        SomeClass1 s2 = new SomeClass1(new Object());
        SomeClass1 s3 = new SomeClass1(333);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
    }
}

class SomeClass1 {

    private String v;

    public <T> SomeClass1(T v) {
        this.v = v.toString();
    }

    public void printInfo() {
        System.out.println(v);
    }
}

