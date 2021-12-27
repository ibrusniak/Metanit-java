
public class Main {

    public static void main(String[] args) {
        
        ChildClass ch1 = new ChildClass();
        System.out.println(ch1);
        System.out.println(ch1.getThis());
        System.out.println(ch1.getSuper());
    }    
}

class ParentClass {

    public ParentClass getThis() {
        return this;
    }
}

class ChildClass extends ParentClass {

    public ParentClass getSuper() {
        return super.getThis();
    }
}

