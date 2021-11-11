package src.p1.p2.p3;

import src.p1.p2.C1;

public class Program {
       
    {
        System.out.println("src.p1.p2.p3.Program initializer");
    } 

    public static void main(String[] args) {
        

        System.out.println("main");
        new Program();
        new C1();
    }
}
