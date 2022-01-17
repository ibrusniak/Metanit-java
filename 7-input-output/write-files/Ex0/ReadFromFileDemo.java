import java.io.FileInputStream;

public class ReadFromFileDemo {

    public static void main(String[] args) {
        
        try (FileInputStream fis = new FileInputStream("myFile.txt")) {
            
            int i = -1;

            while ((i = fis.read()) != -1) {
                System.out.print((char)i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


