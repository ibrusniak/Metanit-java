
public class Example1 {

    public static void main(String[] args) {
        
        int i = 3;
        while(i-- > 0) {
            System.out.println(Class1.getInstance());
        }
    }    
}

final class Class1 {

    private static Class1 instance;

    private Class1() {}

    public static Class1 getInstance() {

        if(instance == null) {
            instance = new Class1();
        }
        return instance;
    }
}

