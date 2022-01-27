
import java.io.ByteArrayInputStream;
import java.util.logging.Logger;

public class ByteArrayInputDemo {

    private static final Logger logger =
        Logger.getAnonymousLogger();

    public static void main(String[] args) {

        byte[] initialArray = new byte[] {
            2, 3, 5, 1, 7, 2, 3, 7, 9, 4
        };

        ByteArrayInputStream istream = new
            ByteArrayInputStream(initialArray);

        logger.info(Integer.toString(initialArray.length));
        logger.info(Integer.toString(istream.available()));

        int i1 = istream.read();
        int i2 = istream.read();

        logger.info("i1 " + i1);
        logger.info("i2 " + i2);

        logger.info("available (after twise read): " + istream.available());

        try {
            istream.skipNBytes(2l);    
        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.info("available (after skipNBytes): " + istream.available());

        istream.reset();

        logger.info("available (after reset): " + istream.available());
        
        try {
            istream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


