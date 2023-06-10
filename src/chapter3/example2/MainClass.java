package chapter3.example2;

public class MainClass {
    public static void main(String[] args) {
        SomeClass s1 = new SomeClass();
        SomeClass s2 = new SomeClass();
        SomeClass s3 = new SomeClass();
        s1.printA();
        s2.printA();
        s3.printA();
        SomeClass.printA();
        SomeClass.printA();
        SomeClass.printA();
    }
}