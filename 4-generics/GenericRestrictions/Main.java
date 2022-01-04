
public class Main {

    public static void main(String[] args) {

        Child1 ch1 = new Child1(200, "Str var");
        Child2 ch2 = new Child2(new Object());        
        GenericClass<Child1, Child2> obj
            = new GenericClass<Child1, Child2>(ch1, ch2);
        
        obj.printInstanceInfo();
    }
}

class GenericClass<Type extends ParrentClass, Type2 extends ParrentClass> {

    private Type v1;
    private Type2 v2;

    public GenericClass(Type v1, Type2 v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public void printInstanceInfo() {
        System.out.printf("v1: [%s][%s], v1: [%s][%s]\n",
        v1.printInstanceInfo(), v1.getClass().getName(),
        v2.printInstanceInfo(), v2.getClass().getName());
    }
}

class ParrentClass {

    protected String printInstanceInfo() {
        return this.toString();
    }
}

class Child1 extends ParrentClass {

    private int a;
    private String str;

    public Child1(int a, String str) {
        this.a = a;
        this.str = str;
    }

    @Override
    protected String printInstanceInfo() {
        return String.format("[%s][%s][%s]",
            this, a, str);
    }
}

class Child2 extends ParrentClass {

    private Object obj;

    public Child2(Object obj) {
        this.obj = obj;
    }

    @Override
    protected String printInstanceInfo() {
        return String.format("{%s}{%s}",
            this, obj);
    }
}

