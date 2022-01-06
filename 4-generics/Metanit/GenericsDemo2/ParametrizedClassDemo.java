
public class ParametrizedClassDemo {

    public static void main(String[] args) {
        
        ParametrizedClass1<Object> obj1 = new ParametrizedClass1<Object>(new Object());
        System.out.println(obj1);
        System.out.println(obj1.getVarType());
        ParametrizedClass1<String> obj2 = new ParametrizedClass1<String>("45545");
        System.out.println(obj2);
        System.out.println(obj2.getVarType());
    }
}

class ParametrizedClass1<T> {
    
    private T var;

    public ParametrizedClass1(T v) {
        var = v;
    }

    public String getVarType() {
        return var.getClass().getName();
    }
}

