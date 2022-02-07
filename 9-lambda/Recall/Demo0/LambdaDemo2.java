
import java.util.ArrayList;

public class LambdaDemo2 {

    public static void main(String[] args) {

        ArrayList<SomeFunctionalInterface> myList = new ArrayList<>();

        // Classic way:
        myList.add(new SomeFunctionalInterface(){

            public void noMatterHowNamed() {
                System.out.println("debug 1");
            }
        });

        myList.add(new SomeFunctionalInterface(){

            public void noMatterHowNamed() {
                System.out.println("debug 2");
            }
        });

        myList.add(new SomeFunctionalInterface(){

            public void noMatterHowNamed() {
                System.out.println("debug 3");
            }
        });

        for (SomeFunctionalInterface s : myList) {
            s.noMatterHowNamed();
        }

        System.out.println();

        // Lambda way:
        myList.add(() -> System.out.println("debug 4"));
        myList.add(() -> System.out.println("debug 5"));
        myList.add(() -> System.out.println("debug 6"));
        
        for (SomeFunctionalInterface s : myList) {
            s.noMatterHowNamed();
        }
    }
}

interface SomeFunctionalInterface {
    public void noMatterHowNamed();
}

