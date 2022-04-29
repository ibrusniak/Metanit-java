
public class Ex2 {

    public static void main(String[] args) {

        Functional generator = SomeClass0::new;
        SomeClass0 ob0 = generator.newInstance("Instance0");
        SomeClass0 ob1 = generator.newInstance("Instance1");
        System.out.println(ob0);
        System.out.println(ob1);
    }
}

interface Functional {
    SomeClass0 newInstance(String name);
}

class SomeClass0 {

    private String name;

    public SomeClass0(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + name;
    }
}


