
public class Datatypes {

    public static void main(String... args) {

        boolean isActive = false;
        
        // 1 byte
        byte b = 4; 

        // 2 bytes
        short s = 344;

        // 4 bytes
        int i = 33333;

        // 8 bytes
        long l = 2342222;

        // 4 bytes
        float f = 333.65F;

        // 8 bytes
        double d = 2.4;

        // 2 bytes
        char ch = 200;

        // long
        var l0 = 1L;
        var l1 = 2l;

        int num222 = 0x6F; // hex
        int num223 = 010; // oct
        int num224 = 0b1101; // bin

        // multiline sttring
        var mst =
            """
                this is
                    multiline
                        string...
            """;
            
        System.out.println(mst);
    }
}


