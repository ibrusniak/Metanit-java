import java.io.Console;
import java.util.logging.Logger;

public record SystemConsoleDemo() {
    
    private static final Logger l = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        
        Console console = System.console();

        if (console == null) {
            l.severe("JVM's default console is null!");
            return;
        } else {
            l.info("JVM started with attached system console!");
        }

        String s = console.readLine();

        l.info("readed line: " + s);

        console.readLine();

        console.flush();

        int i = 0;
        String s1 = "";
        String s2 = "";
        String formattedLine = console.readLine("[%d][%s][%s] ", i, s1, s2);

        l.info("formatted line: " + formattedLine);

        char[] p = console.readPassword();
        String password = String.valueOf(p);

        l.info("password was provided: " + password);
    }
}
