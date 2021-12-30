
public class Ex1 {

    public static void main(String[] args) {

        // We instantiate an anonymous class
        // from an existent one
        doSomeThing(new Object(){

            @Override
            public String toString() {
                return "Anonymous class instance " + hashCode();
            }
        });

        // Implement an interface
        IFace d = new IFace(){

            @Override
            public String toString() {
                return "Anonymous 2 " + hashCode();
            }

            @Override
            public String doSomeThing() {
                return "hello";
            }
        };

        System.out.println(d);
    }

    public static void doSomeThing(Object o) {
        System.out.printf("%s %s\n\n",
            o.getClass().getName(),
            o);
    }
}

interface IFace {
    public String doSomeThing();
}

