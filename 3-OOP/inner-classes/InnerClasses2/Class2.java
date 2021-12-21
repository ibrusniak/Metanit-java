
public class Class2 {

    public class Class2InnerClass1 {

        public void printInfo() {
            System.out.println(Class2.this.getClass().getName());
            System.out.println(this.getClass().getName());
        }
    }
    
}
