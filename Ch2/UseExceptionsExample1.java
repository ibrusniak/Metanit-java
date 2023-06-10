public class UseExceptions {
    public static void main(String args[]) {
        int[] array = new int[2];
        int f = 2;
        try {
            array[3] = 1;
        } catch (Exception e) {
            System.out.printf("A. We are here! Exception: \"%s\"%n", e.getMessage());
        } finally {
            System.out.println("A. We are here! Finally block.");
        }
        try {
            throw new MyOwnException("My own exception has been throwed!");
        } catch (Exception e) {
            System.out.printf("B. We are here! Exception: \"%s\"%n", e.getMessage());
        } finally {
            System.out.println("B. We are here! Finally block.");
        }
    }
}

class MyOwnException extends Exception {
    MyOwnException(String message) {
        super(message);
    }
}
