
public class Main {

    public static void main(String[] args) {

        // AbstractParentClass is abstract; cannot be instantiated
        // AbstractParentClass a1 = new AbstractParentClass("test1");

        AbstractParentClass ch1 = new ChildClass("Initial value");
        System.out.println(ch1.getInfo());
        ch1.setInfo("Modified value");
        System.out.println(ch1.getInfo());
    }
}

abstract class AbstractParentClass {

    protected String info;

    public AbstractParentClass(String s) {
        setInfo(s);
    }

    public void setInfo(String s) {
        info = s;
    }

    public abstract String getInfo();
}

class ChildClass extends AbstractParentClass {

    protected ChildClass(String s) {
        super(s);
    }

    @Override public String getInfo() {
        return info;
    }
}

