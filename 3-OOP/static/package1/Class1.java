
package package1;

public class Class1 {
    
    private static int counter;

    static {

        counter = 0;
    }

    public Class1() {

        counter++;
    }

    public static int getObjectsCount() {

        return counter;
    }
}
