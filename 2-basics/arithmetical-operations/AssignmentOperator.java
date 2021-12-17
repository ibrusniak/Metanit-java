
/**
 * AssignmentOperator
 */
public class AssignmentOperator {

    public static void main(String[] args) {
        
        int a;
        print(a = 10); // 10
        int b;
        print(b = 5 + (a = 100)); // 105
        int c;
        print(a);
        print(b);
        print(c = (b += 5)/*110*/ + (a -= 95) /*5*/);
        print(c);
    }
    
    public static <T> void print(T message) {
        
        System.out.println(message);
    }

    public static void print() {

        System.out.println();
    }
}

