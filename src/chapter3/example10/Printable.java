package chapter3.example10;

import static util.Console.*;

interface Printable {
    default void printInfo() {
        printf("This instance is: {%s}%n", this);
    }
}