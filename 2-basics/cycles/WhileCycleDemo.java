
public class WhileCycleDemo {

    public static void main(String[] args) {

        int a = 10;

        while(a != 10) print("executed"); // never

        while(true) {
            print(" executed ");
            a -= 2;
            if (a == 0) break;
        }

        System.out.println("\n\n");
    }

    public static void print(Object o) {
        
        System.out.print(o);
    }
}

