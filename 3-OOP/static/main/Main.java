
package main;

public class Main {

    public static void main(String[] args) {
        
        // Without static import
        String code = package1.HTTPCode.CODE_200;

        System.out.println(code);

        System.out.println(package1.HTTPCode.getCodeMessage(401));
        System.out.println(package1.HTTPCode.getCodeMessage(201));
    }
}


