
public class Exc {

    public static void main(String[] args) {
        
        try {
           
            prn("debug 1");

            int f = 3 / 0;

        } catch (Exception e) {
            
            prn("debug 2");
            prn(e.getMessage());
            e.printStackTrace();

        } finally {

            prn("debug 3");
        }
    }

    private static void prn(Object o) {
        
        System.out.println(o);
    }
}

