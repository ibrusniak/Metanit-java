
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) {
        
        final String FILE_NAME = "tempFile.txt";

        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oStream = new ObjectOutputStream(fileOutputStream)) {
            
            MyClass myObject = new MyClass(100);
            oStream.writeObject(myObject);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
            ObjectInputStream oStream = new ObjectInputStream(fileInputStream)) {
            
            Object obj = oStream.readObject();
            System.out.println(obj);
            System.out.println(((MyClass)obj).getI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyClass implements Serializable {

    private int i;

    public MyClass(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

