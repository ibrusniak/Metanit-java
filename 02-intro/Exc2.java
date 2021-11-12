

public class Exc2 {

    public static void main(String[] args) {
        
        m1();
    }

    private static void m1() {
        
        m2();
    }

    private static void m2() {
        
        try {
         
            m3();
        } catch (MyException01 my) {
            
            System.out.println("debug 1");
        } catch (Exception e) {
            
            System.out.println("debug 2");
        } finally {

            System.out.println("finally bolck...");
        }
    }

    private static void m3() throws MyException01 {
        
        throw new MyException01("my exception occurs...");
    }

}

class MyException01 extends Exception {

    public MyException01(String m) {

        super(m);
    }

    @Override
    public String getMessage() {
        
        return super.getMessage();
    }
}
