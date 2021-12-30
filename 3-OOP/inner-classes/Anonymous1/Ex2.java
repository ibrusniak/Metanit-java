
public class Ex2 {

    public static void main(String[] args) {
        
        IFace[] array = new IFace[] {

            new IFace() {

                @Override
                public void run() {
                    System.out.println("From anonymous class 1 " + getClass().getName());
                }
            },
            new IFace() {

                @Override
                public void run() {
                    System.out.println("From anonymous class 2 " + getClass().getName());
                }
            },
        };

        for(IFace i : array) {
            i.run();
        }
    }
}

interface IFace {
    
    public void run();
}

