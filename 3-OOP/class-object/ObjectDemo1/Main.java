
public class Main {

    public static void main(String[] args) {
        
        Object obj = new Object();

        prn(obj);
        prn(obj.toString());
        prn(obj.getClass());
        prn(obj.hashCode());

        Object obj2 = new Object();

        prn(obj.equals(obj2));
        prn(!obj.equals(obj2));

        prn(new Main().toString());
        prn(new Main().hashCode());
    }

    public static void prn(Object o) {
        System.out.println(o);
    }

    @Override
    public String toString() {
        return "Main class instance " + hashCode();
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 15;
    }
}

