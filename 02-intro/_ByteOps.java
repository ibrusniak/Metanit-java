
public class _ByteOps {

    public static void main(String... args) {

        int i1 = 10;
        int i2 = 7;
        int i3 = i1 & i2;

        printBinary(i1);
        printBinary(i2);
        printBinary(i3);

        printBinary(65535);
        printBinary(65535 << 2);

        // and so on...
    }

    private static void printBinary(Integer o) {
        
        System.out.println(Integer.toBinaryString(o));
    }
}

