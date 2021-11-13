
public class InitializersTest1 {

    public static void main(String[] args) {
        
        new TestClass1();
    }
}

class TestClass1 {

    {
        System.out.println("First initializer...");
    }

    {
        System.out.println("Second initializer...");
    }

    {
        System.out.println("Third initializer...");
    }
}

