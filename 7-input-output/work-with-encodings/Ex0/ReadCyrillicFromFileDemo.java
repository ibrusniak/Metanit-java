import java.util.SortedMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import java.nio.charset.Charset;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadCyrillicFromFileDemo {

    private static final Logger LOGGER =
        Logger.getAnonymousLogger();

    private static final String FILE_NAME =
        "TextFileWithCyrillic.txt";

    public static void main(String[] args) {

        LOGGER.setLevel(Level.ALL);

        LOGGER.info("Use \"Dfile.encoding=utf-8\" to start JVM with appropriate encoding");
        LOGGER.info("JVM started with: " + Charset.defaultCharset().toString());
        
        SortedMap<String, Charset> avalableCharsets = Charset.availableCharsets();

        Charset utf8 = avalableCharsets.get("UTF-8");

        if (utf8 == null) {
            LOGGER.severe("UTF-8 charset is not available!");
            return;
        }

        try {
            printTextFile(FILE_NAME, utf8);
        } catch (Exception e) {
            LOGGER.severe("Could not print text file!");
            e.printStackTrace();
        }

    }

    private static void printTextFile(String pathName, Charset charset) throws FileNotFoundException {
        
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            throw new FileNotFoundException();
        }

        System.out.println();

        FileReader fReader = null;

        try {

            fReader = new FileReader(file, charset);
            int charCode = fReader.read();
            while (charCode != -1) {

                System.out.print((char) charCode);
                pause(300);
                charCode = fReader.read();
            }
        } catch (Exception e) {
            LOGGER.severe("Could not read byte from file: ");
            e.printStackTrace();
        }

        try {
            fReader.close();    
        } catch (Exception e) {
            LOGGER.severe("Could not close file reader: ");
            e.printStackTrace();
        }

        System.out.println();
    }

    private static void pause(long milliseconds) {

        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {}
    }
}

