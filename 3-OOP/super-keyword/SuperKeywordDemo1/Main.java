
public class Main {

    public static void main(String[] args) {
        
        // 1. 'super' can be used to refer immediate
        // parrent class instance variable
        println((new ChildClass()).getParentS());
        println((new ChildClass()).getOwnS());

        // 2. 'super' can be used to invoke immediate
        // parent class method
        println((new ChildClass()).getParentS2());

        // 3. 'super' can be used to invoke immediate
        // parent class constructor
        println((new ChildClass()).getParentS());
    }

    static void println(Object o) {
        System.out.println(o);
    }
}

class ParentClass {

    ParentClass() {
        s = "parent (after paren constructor call)";
    }

    protected String s = "parent";
    
    public String getOwnS() {
        return s;
    }
}

class ChildClass extends ParentClass {

    ChildClass() {
        super();
    }

    protected String s = "child";

    public String getOwnS() {
        return s;
    }

    public String getParentS() {
        return super.s;
    }

    public String getParentS2() {
        return super.getOwnS();
    }
}

