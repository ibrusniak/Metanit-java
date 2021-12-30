
public class Ex1 {

    public static void main(String[] args) {

        doSomeThing(new Object(){

            @Override
            public String toString() {
                return "Anonymous class instance " + hashCode();
            }
        });
    }

    public static void doSomeThing(Object o) {
        System.out.printf("%s %s",
            o.getClass().getName(),
            o);
    }
}

