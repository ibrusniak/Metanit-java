
public class DoCycleDemo {

    public static void main(String[] args) {
        
        int a = 20;

        // Do cycle execut it's block
        // at least one time

        do {
            print(" executed"); // One time
        } while (a > 20);

        System.out.println();

        do {
            print("executed");
        } while (false);

        System.out.println();

        do {
            print(a + " ");
            a -= 5;
            if(a == 0) break;
        } while (true);
    }

    public static void print(Object o) {
        
        System.out.print(o);
    }
}

