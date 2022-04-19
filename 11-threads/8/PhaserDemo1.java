
import java.util.concurrent.Phaser;

public class PhaserDemo1 {

    public static void main(String[] args) {
        Phaser phaser = new Phaser();
        System.out.println(phaser); // what is phaser exactly?
        phaser.register();
        System.out.println(phaser);
        phaser.register();
        System.out.println(phaser);
        System.out.println();
        phaser.arrive();
        phaser.arrive();
        System.out.println(phaser);
    }
}



