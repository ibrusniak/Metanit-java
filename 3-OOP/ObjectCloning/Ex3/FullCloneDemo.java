/**
 * FullCloneDemo - demonstrates full instance cloning technique
 */
public class FullCloneDemo {

    public static void main(String[] args) {
        
        MyClass m1 = new MyClass();
        m1.printYourself();

        try {
            
            MyClass m2 = m1.clone();
            m2.printYourself();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class MyClass implements Cloneable {

    private SomeAdditionalClass1 sac1;
    private SomeAdditionalClass2 sac2;

    public MyClass() {
        sac1 = new SomeAdditionalClass1("field 1");
        sac2 = new SomeAdditionalClass2("field 2");
    }

    @Override
    public String toString() {
        return
            String.format(
                """
                {
                    \"instance\": \"%s\",
                    \"sac1\": \"%s\",
                    \"sac1.comment\": \"%s\",
                    \"sac2\": \"%s\",
                    \"sac2.comment\": \"%s\"
                }
                """,
                super.toString(),
                sac1.toString(),
                sac1.getComment(),
                sac2.toString(),
                sac2.getComment());
    }

    public void printYourself() {
        System.out.println(this);
    }

    @Override
    protected MyClass clone() throws CloneNotSupportedException {

        MyClass newInstance = (MyClass) super.clone();
        newInstance.sac1 = sac1.clone();
        newInstance.sac2 = sac2.clone();
        return newInstance;
    }
}

class SomeAdditionalClass1 implements Cloneable {

    protected String comment;

    public SomeAdditionalClass1(String c) {
        comment = c;
    }

    public String getComment() {
        return comment;
    }

    @Override
    protected SomeAdditionalClass1 clone() throws CloneNotSupportedException {
        return (SomeAdditionalClass1) super.clone();
    }
}

class SomeAdditionalClass2 extends SomeAdditionalClass1 {

    public SomeAdditionalClass2(String c) {
        super(c);
    }

    @Override
    protected SomeAdditionalClass2 clone() throws CloneNotSupportedException {
        return (SomeAdditionalClass2) super.clone();
    }
}

