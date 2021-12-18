
public class SwitchStatementDemo {

    public static void main(String[] args) {
        
        byte b = 20;

        switch (b) {
            case 20: {
                prn("case 20");
            }
            case 30: {
                prn("case 30");
            }
            case 40:
                prn("case 40");
                break;
            case 50:
                    prn("case 50");
            default:
                prn("default block");
        }

        byte b2 = 2;

        prn("initial: " + b2);

        switch (b2){

            case 1:
                prn("block case 1");
                break;
            case 2:
                prn("block case 2");
                b2 += 2; // b2 = 4 now
                // break;
            case 3:
                prn("block case 3");
                break;
            case 4:
                prn("block case 4");
                b2 -= 3; // b2 = 1 now
            default:
                prn("default");
        }

        prn(b2); // 4
    }

    public static <T> void prn(T message) {
        
        System.out.println(message);
    }
}
