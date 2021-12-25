
public class App1 {

    public static void main(String[] args) {
        
        // Test 1. Protected and private members and acces to them
        ParentClass pc1 = new ParentClass();
        println(pc1.protectedMember); // normal, because it is protected
        
        // Compilation error. Private modifier.
        // Member cannot be accessed through the object variable
        // println(pc1.privateMember);

        // normal. Protected functions
        // are accessible from the same package
        println(pc1.getProtectedMember());

        println(pc1.getPrivateMember());
    }

    public static void println(Object o) {
        System.out.println(o);
    }
}

class ParentClass {

    protected String protectedMember
            = "ParentClass protected member";
    
    private String privateMember
            = "ParentClass private member";
    
    protected String getProtectedMember() {
        return this.protectedMember;
    }

    protected String getPrivateMember() {
        return this.privateMember;
    }
}

