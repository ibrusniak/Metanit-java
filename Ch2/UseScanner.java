import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter line and press \"Enter\": ");
        String s = scanner.nextLine();
        System.out.printf("Line readed: \"%s\"\n", s);
        scanner.close();
    }
}