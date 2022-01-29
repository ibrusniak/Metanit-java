import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class SerializationDemo2 {

    public static void main(String[] args) {

        System.out.println(new MyClass(10, "str77").toString());
        System.out.println(new MyClass(5, "str23").toString());

        ArrayList<ITestable> list = new ArrayList<>();

        list.add(new Test1());
        list.add(new Test2());

        Iterator<ITestable> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next().runTest();
        }
    }
}

class MyClass implements Serializable {

    private int i;
    private String s;
    transient private String transientMember;

    public MyClass(int i, String s) {
        this.i = i;
        this.s = s;
        this.transientMember = "Transient member (" + s + ")";
    }

    @Override
    public String toString() {
        return String.format("instance: %s; i = %s, s = %s, transientMember = %s", super.toString(), i, s, transientMember);
    }
}

interface ITestable {

    public default void printBeginTest() {
        System.out.printf("Test [%s] started\n", this);
    }

    public default void printEndTest() {
        System.out.printf("Test [%s] ended\n", this);
    }

    public void runTest();
}

public class Test1 implements ITestable {

    @Override
    public void runTest() {

        printBeginTest();

        printEndTest();
    }
}

public class Test2 implements ITestable {

    @Override
    public void runTest() {

        final String FNAME = "f1.tmp";

        printBeginTest();

        ArrayList<Object> list = new ArrayList<>();

        list.add(200);
        list.add(2.33f);
        list.add("БлаБлаБла, кириллица");
        list.add(new MyClass(20, "STRING_LITERAL"));

        putObjectsToFile(FNAME, list);

        getObjectsFromFile(FNAME);

        printEndTest();
    }

    private void putObjectsToFile(String fileName, ArrayList list) {

        FileOutputStream fileOStream = null;
        ObjectOutputStream objectOStream = null;

        try {

            fileOStream = new FileOutputStream(fileName);
            objectOStream = new ObjectOutputStream(fileOStream);
        } catch (Exception e) {

            e.printStackTrace();
            return;
        }

        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {

            try {
                Object o = iterator.next();
                objectOStream.writeObject(o);
                System.out.println("Object placed into file: " + o.getClass().getSimpleName() + ", " + o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        closeAllStreams(fileOStream, objectOStream);
    }

    private void getObjectsFromFile(String fileName) {
        
        FileInputStream fileIStream = null;
        ObjectInputStream objectIStream = null;
        OutputStreamWriter oStreamWriter = null;

        try {

            fileIStream = new FileInputStream(fileName);
            objectIStream = new ObjectInputStream(fileIStream);
            oStreamWriter = new OutputStreamWriter(System.out, "UTF-8");
        } catch (Exception e) {

            e.printStackTrace();
            return;
            
        }

        try {        
            Object o = null;
            while((o = objectIStream.readObject()) != null) {
                System.out.println("readed object:  " + o.getClass().getName() + ", " + o);
            }
        } catch (EOFException e) {
            // Do nothing. It is normal
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        closeAllStreams(fileIStream, objectIStream, oStreamWriter);
    }

    private void closeAllStreams(Closeable... streams) {

        for (Closeable stream : streams) {

            try {
                stream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
