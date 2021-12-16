import java.io.PrintStream;

/**
 * ConsoleIn
 */
public class ConsoleIn {

    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        PrintStream out = System.out;
        String lineScannedFromConsole;

        do {
            lineScannedFromConsole = scanner.nextLine();
            out.printf(">>> %s\n", lineScannedFromConsole);
            scanner.reset();
        } while (!lineScannedFromConsole.equals("halt"));
        out.printf("\n\nHalted...\n");
    }
}