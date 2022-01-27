
import java.util.logging.Logger;
import java.io.ByteArrayOutputStream;

public class ByteArrayOutputDemo {

    private static final Logger logger =
        Logger.getAnonymousLogger();

    public static void main(String[] args) {
        
        ByteArrayOutputStream os = new ByteArrayOutputStream(100);

        os.write(100);
        os.write(200); // -56

        os.writeBytes(new byte[] {23, 24, 25});
        os.writeBytes(new byte[] {21, 20, 19});

        logger.info("size: " + os.size());

        byte[] temp = os.toByteArray();

        String s = "";
        for (byte b : temp) {
            s += b + " ";
        }

        logger.info("os: " + s);
    }
}

