
public class Test5 {

    public static void main(String[] args) {
        
        Printer printer = new Printer();

        printer.printSeries(new Printable[] {
            new Book(),
            new Booklet(),
            new Jornal()
        });
    }
}

class Printer {

    public void print(Printable obj) {
        obj.print();
    }

    public void printSeries(Printable... objects) {

        for(Printable p: objects) {
            p.print();
        }
    }
}

interface Printable {

    default void print() {
        System.out.println("Default. Printint page after page");
    };
}

class Book implements Printable {}

class Booklet implements Printable {

    @Override
    public void print() {
        System.out.println("Open booklet and print whole paper");
    }
}

class Jornal implements Printable {

    @Override
    public void print() {
        System.out.println("Print page after page with jornal-specific technique");
    }
}

