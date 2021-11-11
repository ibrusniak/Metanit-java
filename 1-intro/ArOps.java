
public class ArOps {

    public static void main(String... args) {

        int i = 2;
        float f = 1.1f;

        prn(i - f); // 0.9
        prn(2 - 1.1f); // 0.9
        prn(2 - 1.1d); // 0.8999999999999999

        int a = 2, b = 2;
        
        prn(a--); // 2, postfix form
        prn(--b); // 1, prefix form
    }

    private static void prn(Object o) {
        System.out.println(o);
    }
}
