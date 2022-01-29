
public class StringDemo3 {

    public static void main(String[] args) {

        
        try {
            
            String email1 = "someEmail@someServer.domain";
            String pattern1 = ".";
            String pattern2 = ".*";
            String pattern3 = "";
            String pattern4 = "[_a-zA-Z]{5,}[0-9]*[_a-zA-Z]*@[_a-zA-Z0-9]*.[a-zA-Z0-9]*";

            System.out.printf("\n[%s] matches patter [%s]? %s\n", email1, pattern1, email1.matches(pattern1));
            System.out.printf("\n[%s] matches patter [%s]? %s\n", email1, pattern2, email1.matches(pattern2));
            System.out.printf("\n[%s] matches patter [%s]? %s\n", email1, pattern3, email1.matches(pattern3));
            System.out.printf("\n[%s] matches patter [%s]? %s\n", email1, pattern4, email1.matches(pattern4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

