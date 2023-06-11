package chapter3.example9;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        A refA = new A();
        A refC = new C();

        printf("refC instanceof A: %s%n", refC instanceof A);
        printf("refC instanceof Object: %s%n", refC instanceof Object);
        printf("refC instanceof B: %s%n", refC instanceof B);

        refA.doSmth();
        refC.doSmth();
        ((A)refC).doSmth();
        // ((A)refC).doSmthSpecific(); // error
    }
}