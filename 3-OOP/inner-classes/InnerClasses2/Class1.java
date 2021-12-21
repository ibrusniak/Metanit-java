
public class Class1 {

    private int class1PrivateMember;

    public Class1(int v) {
        class1PrivateMember = v;
    }

    public void getClass1PrivateMember() {
        System.out.println(this.class1PrivateMember);
    }

    // Nested - inner private class
    private class InnerPrivateClass1 {

        public void printInfo() {
            System.out.println(this.getClass().getName());
        }
    }

    public class InnerPublicClass2 {

        public void printInfo() {
            System.out.println(this.getClass().getName());
        }
    }

    public Object returnLocalClassObject() {

        class LocalClass1 {

            public void printInfo() {
                System.out.println(this.getClass().getName());
            }
        }

        return new LocalClass1();
    }
    

}

