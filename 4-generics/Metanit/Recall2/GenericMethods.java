
public class GenericMethods {

    public static void main(String[] args) {
        
        println("hello");
        println(3);

        new Class1().<String>printInfo("Str");
        new Class1().<Integer>printInfo(200);
    }

    public static <T> void println(T obj) {
        System.out.println(obj);
    }
}

class Class1 {

    public <T> void printInfo(T t) {
        System.out.println(t.getClass().getSimpleName());
    }
}

