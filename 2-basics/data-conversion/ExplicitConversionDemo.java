
/**
 * ExplicitConversionDemo
 */
public class ExplicitConversionDemo {

    public static void main(String[] args) {
        
        // Integer and Double are the main
        // primitive data types (automatic)
        prn(20);
        prn(2.2);

        prn(2.2f);
        prn((short)20);
        prn((byte)20);

        prn(20 + 2.2); // int -> double automatic
        prn(20 + 2.2f); // int -> float automatic
        
        prn(20l + 2.2333f); // long -> float automatic

        prn(0 + 'a'); // 97 char -> int automatic
        prn('b' + 0); // 98 char -> int automatic
        prn((char)(99)); // 'c'
    }

    private static <T> void prn(T message) {

        System.out.println(
            "[" + message.getClass().getSimpleName() + "] "
            + message);
    }
}
