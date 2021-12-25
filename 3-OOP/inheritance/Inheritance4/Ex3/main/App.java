
package main;

public class App {

    public static void main(String[] args) {
        
        classes.ParentClass pc1 = new classes.ParentClass();

        // error: protectedMember has protected access in ParentClass
        System.out.println(pc1.protectedMember);
    }
}

