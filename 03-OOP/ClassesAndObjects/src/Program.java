
public class Program {

    public static void main(String[] args) {
        
        PrintableClass array[] = new PrintableClass[10];

        array[0] = new C1();
        array[1] = new C2();

        for(PrintableClass p : array) {
            
            if(p == null) break;
            p.printInfo();
        }
    }
}

