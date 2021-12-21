
public class Main {

    public static void main(String[] args) {
        Class1 c1 = new Class1(2);
        c1.getClass1PrivateMember();
        // Class1.InnerPrivateClass1 has private access in Class1
        // Class1.InnerPrivateClass1 c1pic1 = c1.new InnerPrivateClass1();
        Class1.InnerPublicClass2 c1ipc1 =
                c1.new InnerPublicClass2();
        c1ipc1.printInfo();
        var o = c1.returnLocalClassObject();
        System.out.println(o.getClass().getName());
        // cannot find symbol
        // c1.returnLocalClassObject().printInfo();
        Class2 c2 = new Class2();
        Class2.Class2InnerClass1 c2i1 = c2.new Class2InnerClass1();
        c2i1.printInfo();
    }
}

