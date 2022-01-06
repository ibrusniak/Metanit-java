

public class GenericConstructor {

    public static void main(String[] args) {
        
        new Class1(150).print();
        new Class1('h').print();
        new Class1("String arg").print();
    }
}

class Class1 {

    private String type;

    public <T> Class1(T t) {
        type = t.getClass().getName();
    }

    public void print() {
        System.out.println("Type of argument: " + type);
    }
}

