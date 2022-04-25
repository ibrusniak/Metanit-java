
public class AnonymousClassDemo2 {

    public static class InnerClass {
        
        public void doSmth() {
            System.out.println("InnerClass.doSmth()");
        }
    }

    public static void main(String[] args) {
        AnonymousClassDemo2.InnerClass i0
            = new AnonymousClassDemo2.InnerClass();
        
        i0.doSmth();
    }
}
