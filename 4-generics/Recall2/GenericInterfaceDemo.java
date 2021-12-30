import javax.naming.spi.InitialContextFactory;
import javax.print.attribute.standard.PrinterInfo;

public class GenericInterfaceDemo {

    public static void main(String[] args) {
        
        Class1 c1 = new Class1();
        c1.printInfo("String");
        Class2<Integer> c2 = new Class2<Integer>();
        c2.printInfo(150);
    }    
}

class Class2<T> implements IFace1<T> {

    public void printInfo(T object) {
        System.out.println(object.getClass().getSimpleName());
    }
}

class Class1 implements IFace1<String> {

    public void printInfo(String object) {
        System.out.println(object.getClass().getSimpleName());
    }
}

interface IFace1<T> {

    public void printInfo(T object);
}

