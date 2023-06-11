package chapter3.example10;

import static util.Console.*;

public class PrintableClassB implements Printable {
    public void printInfo() {
        printf("This instance is: {%s}. Class \"PrintableClassB\" implementation :)%n", this);
    }
}
