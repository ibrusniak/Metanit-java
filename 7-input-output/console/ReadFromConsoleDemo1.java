
import java.util.logging.Logger;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.CharBuffer;

public class ReadFromConsoleDemo1 {
    
    private static final Logger l = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        
        InputStream inputStream = System.in;
        PrintStream outputStream = System.out;
        PrintStream errorStream = System.err;

        outputStream.print("type something: ");
        byte[] byteBuffer = new byte[100];

        try {
            inputStream.read(byteBuffer);
        } catch (Exception e) {
            l.severe("Error while try to read from System.in");
            e.printStackTrace();
        }

        char[] charBuffer = new char[byteBuffer.length];

        for(int i = 0; i < byteBuffer.length; i++)
            charBuffer[i] = (char)byteBuffer[i];

        outputStream.println();
        String s = String.valueOf(charBuffer);
        l.info("String provided: " + s);
    }
}

