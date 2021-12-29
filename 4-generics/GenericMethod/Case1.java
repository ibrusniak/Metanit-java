
public class Case1 {

    public static void main(String[] args) {
        
        new Class1().<String>doSomeThing("String");
        new Class1().<Object>doSomeThing(new Object());


    }
}

class Class1 {

    public <T> void doSomeThing(T obj) {
        System.out.println(obj.getClass().getName());
    }
}

