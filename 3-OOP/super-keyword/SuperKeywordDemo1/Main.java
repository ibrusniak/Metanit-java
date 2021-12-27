
public class Main {

    public static void main(String[] args) {
        
        // 1. 'super' can be used to refer immediate
        // parrent class instance variable
        println((new ChildClass()).getParentS());
        println((new ChildClass()).getOwnS());

    }

    static void println(Object o) {
        System.out.println(o);
    }
}

class ParentClass {

    protected String s = "parent";
    
}

class ChildClass extends ParentClass {

    protected String s = "child";

    public String getOwnS() {
        return s;
    }

    public String getParentS() {
        return super.s;
    }
}

