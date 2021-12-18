
public class ArrayDeclarationDemo {

    public static void main(String[] args) {
        
        Byte[] byteArray1 = new Byte[10];
        Byte byteArray2[] = new Byte[4];
        Byte byteArray3[] = { 2, 3, 4, 1, 5, 7 };

        printArray(byteArray1);
        printArray(byteArray2);
        printArray(byteArray3);

        System.out.println();

        Integer nums[];
        nums = new Integer[] { 20, 30, 10, 50 };

        printArray(nums);

        System.out.println();

        Byte[][] byteArray4 = new Byte[][] {{2, 4}, {4, 6}, {9, 5}};

        for(byte i = 0; i < byteArray4.length; i++) {
            
            for (int j = 0; j < byteArray4[i].length; j++) {
                
                System.out.print(" " + byteArray4[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        Byte[][] byteArray5 = {
            { 2, 4, 3, 2 },
            { 1, 2, 8 },
            { 9, 2 },
            { 10, 3, 7, 2, 7 }
        };

        for(Byte[] bArray : byteArray5) {

            for(byte i = 0; i < bArray.length; i++) {

                System.out.print(" " + bArray[i]);
            }
            System.out.println();
        }
    }   

    private static <T extends Number> void printArray(T[] array) {
        
        for(T i : array) System.out.print(" " + i);
        System.out.println();
    }
}