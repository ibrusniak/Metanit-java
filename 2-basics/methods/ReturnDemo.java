

public class ReturnDemo {

    public static void main(String[] args) {
        
        print(200l);
        print(300);

        print(doSmth2(2000));
    }

    public static <V> V doSmth2(V a) {
        
        return a;
    }

    public static <Q> void print(Q in) {
        
        System.out.printf("[%1$s] %2$d", in.getClass().getSimpleName(), in);
        System.out.println();
    }

    public static void doSmth() {
        
        return;
    }
}

