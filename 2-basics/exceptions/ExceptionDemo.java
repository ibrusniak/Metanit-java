
public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            Byte b = doSmth();
        } catch (MyException1 ex1) {
            System.out.println(ex1.getMessage());
        } catch (MyException2 ex2) {
            System.out.println(ex2.getMessage());
        } catch (Exception ex) {
            System.out.println("Something else");
        }
    }

    public static Byte doSmth() throws MyException1, MyException2 {

        java.util.Scanner reader = new java.util.Scanner(System.in);
        Byte b = reader.nextByte();
        reader.close();
        if (b < -127)
            throw new MyException1("number less than -127");
        if (b > 128)
            throw new MyException2("number grater than 128");
        return b;
    }
}

class MyException1 extends Exception {

    MyException1(String message) {

        super(message);
    }
}

class MyException2 extends Exception {

    MyException2(String message) {

        super(message);
    }
}
