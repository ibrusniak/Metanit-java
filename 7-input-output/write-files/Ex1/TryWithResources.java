
public class TryWithResources {

    public static void main(String[] args) {
        
        Random rnd1 = new Random();
        Random rnd2 = new Random();

        for(int i = 0; i < 10; i++) {
            System.out.println("random: " + rnd1.nextInt(16));
        }

        System.out.println();

        for(int i = 0; i < 10; i++) {
            System.out.println("random10: " + rnd2.nextInt(30));
        }
    }
}



