
package main;

import package1.ChildClass;

public class Main {

    public static void main(String[] args) {
        
        System.out.println(new ChildClass()
            .getMemberWithDefaultAccess());
        
        System.out.println(new package2.ChildClass()
            .getMemberWithDefaultAccess());
    }
}

