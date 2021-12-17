import javax.print.attribute.standard.PrinterLocation;

public class BitwiseOperationsDemo {

    public static void main(String[] args) {
        
        int a = 1;
        int b = -1;

        print(toBinStr(a)); // 00000000 00000000 00000000 00000001
        print(toBinStr(b)); // 11111111 11111111 11111111 11111111

        a = 15; // 1111
        print(toBinStr(a << 1)); // 11110
        print(toBinStr(a >> 1)); //  0111

        printDelemiter();

        // Shift operations
        int i = 24;
        print(i);
        print(i << 1); // i * 2
        print(i >> 1); // i / 2
        print(i << 2); // i * 4
        print(i >> 2); // i / 4
        print(i << 3); // i * 8
        print(i >> 3); // i / 8
        print(i >> 4); // i / 16 = 1

        printDelemiter();

        // & - AND
        // | - OR
        // ~ - NOT
        // ^ - XOR

        // AND (&) operation
        a = 4;
        b = 5;
        print(toBinStr(a));
        print(toBinStr(b));
        print(toBinStr(a & b)); // 100 & 101 = 100

        printDelemiter();

        print(true & false);    // true or false = false
        print(false & true);    // false or true = false
        print(true & true);     // true or true = true
        print(false & false);   // false or false = false

        printDelemiter();

        // OR (|) operation
        a = 25;
        b = 30;
        print(toBinStr(a));     // 11001
        print(toBinStr(b));     // 11110
        print(toBinStr(a | b)); // 11111

        print(true | false);    // true
        print(false | true);    // true
        print(true | true);     // true
        print(false | false);   // false

        printDelemiter();
        
        // XOR (^) operation
        a = 24;
        b = 40;
        printBin(a);
        printBin(b);
        printBin(a ^ b);

        print(true ^ true);     // false
        print(true ^ false);    // true
        print(false ^ true);    // true
        print(false ^ false);   // false

        // Use xor to encrypt and decrypt numbers
        int number = 505,
            key = 22;

        int encryptedNumber = number ^ key;
        int decryptedNumber = encryptedNumber ^ key;

        print(number);
        print(decryptedNumber);

        printDelemiter();

        // ~ logical NOT
        a = 10;
        printBin(a);
        printBin(~a);

        // Error: bed operand type
        // print(~true);
        // print(~false);
    }   

    public static <T> void print(T message) {
        
        System.out.println(message);
    }

    public static void printDelemiter() {
        
        System.out.println("****************************************");
    }

    public static String toBinStr(Integer i) {
        
        return Integer.toBinaryString(i);
    }

    public static void printBin(Integer i) {
        
        print(toBinStr(i));
    }
}

