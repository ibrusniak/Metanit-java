
public class Main {

    public static void main(String[] args) {
        
        ParentClass[] array = new ParentClass[] {
            new ParentClass(),
            new ChildClass1(),
            new ChildClass2()
        };

        for(ParentClass p : array) {
            p.showInfo();
        }

        System.out.println();

        ParentClass p1 = new ChildClass2();
        ((ParentClass)p1).showInfo();

        System.out.println();

        // Exception: ClassCastException:
        // class ParentClass cannot be cast to class ChildClass2
        // ChildClass2 ch1 = (ChildClass2)(new ParentClass());
        // ch1.showInfo();

        Object obj = new ChildClass2();
        // Error: cannot find symbol
        // obj.showInfo();

        // Normal! Downcasting
        ((ChildClass2)obj).showInfo();

        Object obj1 = new ChildClass2();
        
        // True, everyone object
        // is instance of java.lang.Object
        if(obj1 instanceof Object) {
            System.out.println("obj1 is instanse of Object");
        }
        
        // True. ChildClass2 is inherited
        // from class ParentClass
        if(obj1 instanceof ParentClass) {
            System.out.println("obj1 is instanse of ParentClass");
        }

        // Also true
        if(obj1 instanceof ChildClass2) {
            System.out.println("obj1 is instanse of ChildClass2");
        }
    }
}

class ParentClass {

    public void showInfo() {
        System.out.println("Method from ParentClas");
    }
}

class ChildClass1 extends ParentClass {

    @Override public void showInfo() {
        System.out.println("Method from ChildClass1");
    }
}

class ChildClass2 extends ParentClass {

    @Override public void showInfo() {
        System.out.println("Method from ChildClass2");
    }
}

