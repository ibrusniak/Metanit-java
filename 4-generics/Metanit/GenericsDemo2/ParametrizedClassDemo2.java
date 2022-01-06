
public class ParametrizedClassDemo2 {

    public static void main(String[] args) {
        
        ParametrizedClass<Integer, Character, Float, String>
            pc = new ParametrizedClass<Integer, Character, Float, String>(100, 'c', 2.4f, "str_");
        
        pc.printInfo();
        System.out.println();
        pc.printInfo2();
    }
}

class ParametrizedClass<T, F, W, D> {

    private T t;
    private F f;
    private W w;
    private D d;

    public ParametrizedClass(T t, F f, W w, D d) {

        this.t = t;
        this.f = f;
        this.w = w;
        this.d = d;
    }

    public void printInfo() {
        
        java.lang.reflect.Field[] fields = getClass().getDeclaredFields();
        for(java.lang.reflect.Field f : fields) {
            System.out.printf("Field name: %1$s, type: %2$s\n",
                f.getName(), f.getClass());
        }
    }

    public void printInfo2() {

        System.out.println(t.getClass().getSimpleName());
        System.out.println(f.getClass().getSimpleName());
        System.out.println(w.getClass().getSimpleName());
        System.out.println(d.getClass().getSimpleName());
    }
}

