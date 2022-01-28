import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class BufferedInputStreamDemo {

    public static void main(String[] args) {
        
        String source = "Source string.";
        byte[] byteArray = source.getBytes();
        ByteArrayInputStream  bos =
            new ByteArrayInputStream(byteArray);

        
        try (BufferedInputStream buffered = new BufferedInputStream(bos)) {
            
            int c;
            while((c = buffered.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println();
    }
}

