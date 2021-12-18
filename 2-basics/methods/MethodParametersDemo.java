
public class MethodParametersDemo {

    public static void main(String[] args) {

        doSmth("first parameter", "fd", "sss", "ggg");
        doSmth2(new String[] { "df", "dfdf" });
    }

    public static <F, G> void doSmth(F arg1, G... args2) {
        
        prn(arg1);
        printArray(args2);
    }

    public static <Q> void printArray(Q[] array) {
        
        for(Q q : array) prn(" " + q);
        System.out.println();
    }

    public static <N> void prn(N param) {
        
        System.out.print(param);
    }

    public static void doSmth2(String[] arg) {
        
        printArray(arg);
    }
}

