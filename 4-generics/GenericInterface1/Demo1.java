
public class Demo1 {

    public static void main(String[] args) {
        
        SomeClass1 sc = new SomeClass1();
        System.out.println(sc.getT());
    }
}

interface Interface1<T> {

    T getT();
}

class SomeClass1 implements Interface1<String> {

    @Override
    public String getT() {
        return "String 1";
    }
}



