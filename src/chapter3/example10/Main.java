package chapter3.example10;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {

        /**
         * Use anonymous class that implements 'Printable' interface.
         */
        printPrintable(new Printable(){});
        printPrintable(new Printable(){
            public void printInfo() {
                printf("This is anonymous class implementation!%n");
            }
        });
        printPrintable(new PrintableClassA());
        printPrintable(new PrintableClassB());
    }
    private static void printPrintable(Printable p) {
        p.printInfo();
    }
}

// Output:
// This instance is: {chapter3.example10.Main$1@3af49f1c}
// This is anonymous class implementation!
// This instance is: {chapter3.example10.PrintableClassA@2f2c9b19}
// This instance is: {chapter3.example10.PrintableClassB@1c20c684}. Class "PrintableClassB" implementation :)

