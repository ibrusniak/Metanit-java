
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
    
    public static void main(String[] args) {

        OutputStream out = System.out;

        try (PrintStream printStream = new PrintStream(out, false, "UTF-8");) {

            printStream.write("Test string 1\n".getBytes());
            printStream.write("Тестовая строка (кириллица)\n".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


