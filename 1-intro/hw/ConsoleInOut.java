
public class ConsoleInOut {

    public static void main(String... args) {

        // OUTPUT

        System.out.println("Line with CRLF");
        System.out.printf("First %x\nSecond %f\nThird %e (exponential form)\nChar %c\nString %s\n\n",
            65534, 2.2, 2.3,'c', "Str2");
        
        var fName = "Ivan";
        var lName = "Zubov";
        var age = 35;
        var height = 1.77f;

        System.out.printf("First name: %s\nLast name: %s\nAge: %d\nHeight: %f\n\n", fName, lName, age, height);

        // INPUT

        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        msg("int:");
        sc.nextInt();
        msg("line:");
        sc.nextLine();
        msg("double");
        sc.nextDouble();
        msg("boolean");
        sc.nextBoolean();
        msg("ok!");

        sc.close();
    }

    private static void msg(Object m) {

        System.out.printf("%s\n", m);
    }
}
