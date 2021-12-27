
public class Example1 {

    public static void main(String[] args) {
        
        PrintableFactory factory = new PrintableFactory();

        IPrintable[] objects = {
            factory.produceObject(typeOfObject.CLASS1),
            factory.produceObject(typeOfObject.CLASS2),
            factory.produceObject(typeOfObject.CLASS2)
        };

        for (IPrintable p : objects) {
            p.print();
        }
    }
}

interface IPrintable {
    public void print();
}

class Class1 implements IPrintable {

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }
}

class Class2 implements IPrintable {

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }
}

enum typeOfObject {
    CLASS1,
    CLASS2
}

final class PrintableFactory {

    public IPrintable produceObject(typeOfObject type) {
        
        IPrintable newObject;

        switch (type) {
            case CLASS1 :
                newObject = new Class1();
                break;
            case CLASS2 :
                newObject = new Class2();
                break;
            default :
                newObject = null;
        }

        return newObject;
    }
}

