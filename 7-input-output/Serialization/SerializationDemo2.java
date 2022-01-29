import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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

        while(iterator.hasNext()) {
            iterator.next().runTest();
        }
    }    
}

class MyClass implements Serializable {

    private int i;
    private String s;
    
    public MyClass(int i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    public String toString() {
        return String.format("instance: %s; i = %s, s = %s", super.toString(), i, s);
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
        
        printEndTest();
    }
    
    private void putObjectsToFile(String fileName, ArrayList list) {
        
        FileOutputStream fileOStream = null;
        ObjectOutputStream objectOStream = null;
        
        try {
            fileOStream = new FileOutputStream(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            objectOStream = new ObjectOutputStream(fileOStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            
            try {
                Object o = iterator.next();
                objectOStream.writeObject(o);
                System.out.println("Object placad into file: " + o.getClass().getSimpleName() + ", " + o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        if (fileOStream != null) {
            
            try {
                fileOStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        if (objectOStream != null) {
            
            try {
                objectOStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

