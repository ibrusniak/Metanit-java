
package generic.common;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        
        Class1<String> c1 = new Class1<String>("Hello generics!");
        System.out.println(c1.getFieldInfo());
        Class1<Integer> c2 = new Class1<Integer>(155);
        System.out.println(c2.getFieldInfo());
        System.out.println(c1.getField());
        System.out.println(c2.getField());
    }
}

class Class1 <Type> {

    private Type field;

    public Class1(Type value) {
        field = value;
    }

    public void setField(Type value) {
        field = value;
    }

    public Type getField() {
        return field;
    }

    public String getFieldInfo() {
        
        return
            String.format("Instance type: %s, \"field\" type: %s, \"field\" vale: %s",
                getClass().getName(),
                field.getClass().getName(),
                field);
    }
}

