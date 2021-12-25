
package package2;

public class ChildClass extends package1.ParentClass {

    public String getMemberWithDefaultAccess() {
        
        // error: memberWithDefaultAccess is not public in
        // ParentClass; cannot be accessed from outside package
        return
            memberWithDefaultAccess;
    }
}

