
/**
 * 
 *  Demo of 
 * 
 */
public class Main {

    public static void main(String[] args) {
        
        RegularParent r = new ChildForRegularParent();
        System.out.println(r.getS()); // Child
        // "Parent", because child class
        // does not have overrided method "getD"
        System.out.println(r.getD());
    }
}

class RegularParent {

    protected String s = "Parent";

    protected String d = "Parent";

    public String getS() {
        return s;
    }

    public String getD() {
        return d;
    }
}

class ChildForRegularParent extends RegularParent {

    private String s = "Child";

    private String d = "Child";

    public String getS() {
        return s;
    }
}


