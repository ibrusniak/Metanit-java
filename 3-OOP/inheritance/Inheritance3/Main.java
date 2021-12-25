
/**
 * 
 *  Demo of 
 * 
 */
public class Main {

    public static void main(String[] args) {
        
        RegularParent r = new ChildForRegularParent();
        System.out.println(r.getS()); // Child
    }
}

class RegularParent {

    protected String s = "Parent";

    public String getS() {
        return s;
    }
}

class ChildForRegularParent extends RegularParent {

    private String s = "Child";

    public String getS() {
        return s;
    }
}


