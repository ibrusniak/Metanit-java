

public class ConditionalOperatorsDemo {

    public static void main(String[] args) {
        
        // ==, !=, <, >, <=, >=

        Boolean answer;
        
        int a = 10, b = 4;

        answer = a == b; // false
        prn(answer);

        prn(false == 2 < 3);
    }

    public static void prn(Object o) {
        
        System.out.println(o);
    }
}
