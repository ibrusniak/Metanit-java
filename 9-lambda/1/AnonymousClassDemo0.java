
public class AnonymousClassDemo0 {

    public static void main(String[] args) {
        new Interface0(){
                public void doSmth() {
                    System.out.println("Anonymous class method called");
                };
            }.doSmth();
        
        Interface0 i = new Interface0() {
            public void doSmth() {
                System.out.println("Another anonymous instance method called");
            };
        };
        System.out.println(i);
    }
}

interface Interface0 {
    public void doSmth();
}

