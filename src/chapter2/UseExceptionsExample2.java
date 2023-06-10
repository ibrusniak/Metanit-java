package chapter2;

public class UseExceptionsExample2 {
    public static void main(String[] args) {
        try {
            int a = 2/0;
            if (true)
                throw new MyOwnException1("Message A.");
            else
                throw new MyOwnException2("Message B.");
        } catch (MyOwnException1 e) {
            println("A");
        } catch (MyOwnException2 e) {
            println("B");
        } catch (Exception e) {
            println("C");
        } finally {

        }
    }
    private static void println(Object o) {
        System.out.println(o);
    }
    private static void printf(String pattern, Object... args) {
        System.out.printf(pattern, args);
    }
}

class MyOwnException1 extends Exception {
    MyOwnException1(String message) {
        super(message);
    }
}

class MyOwnException2 extends Exception {
    MyOwnException2(String message) {
        super(message);
    }
}
