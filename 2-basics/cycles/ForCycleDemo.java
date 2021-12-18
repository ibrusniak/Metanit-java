

public class ForCycleDemo {

    public static void main(String[] args) {
        
        for(byte b = 0; b <= 100; b += 5) {

            print(b + (b == 100 ? "" : ", "));
        }

        for(byte b = 0; b != 0; b += 1) System.out.println(b); // never

        byte[] byteArray = { 3, 4, 5 };

        System.out.println();

        for(byte b : byteArray) {

            print(b + " ");
        }

        System.out.println("\n\n");

        for(int i = 100, j = 500, q = 1000; q >= 0; i += 20, j += 30, q -= 100) {

            System.out.printf("%d\t%d\t%d\n", i, j, q);
        }

        System.out.println("\n\n");

        int j = 20;

        for(;;) {

            j += 5;
            print(j + " ");
            if(j == 100) break;
        }

        System.out.println("\n\n");

        int i = 2;
        for(;; i += 2) if(i == 30) break;
        print(i);

        System.out.println("\n\n");

        String s = "Hello world!";

        char[] charArray = s.toCharArray();

        for(char c : charArray) print(c + "   ");
        
        System.out.println();
    }

    public static void print(Object o) {
        
        System.out.print(o);
    }
}

