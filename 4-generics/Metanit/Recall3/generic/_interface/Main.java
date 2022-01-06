
package generic._interface;

public class Main {

    public static void main(String[] args) {
        
        // error: type argument Class2ExtendsClass1
        // is not within bounds of type-variable Type
        // Class2<Class2ExtendsClass1> c1
        //    = new Class2<Class2ExtendsClass1>(new Class2ExtendsClass1());
        
        Class2<Class4ExtendsClass1ImplementsInterface1> c2 =
            new Class2<Class4ExtendsClass1ImplementsInterface1>(
                new Class4ExtendsClass1ImplementsInterface1()
            );

        String s = c2.getField().doSome();
        System.out.println(s);
    }
}

interface Interface1 {

    public default String doSome() {
        return "default doSome() from Interface executed";
    }
}

class Class1 {

    public String doSome() {
        return "doSome() from Class1 executed";
    }
}

class Class2<Type extends Class1 & Interface1> {

    private Type field;

    Class2(Type f) {
        field = f;
    }

    public Type getField() {
        return field;
    }
}


class Class2ExtendsClass1 extends Class1 {}

class Class3ImplementsInterface1 implements Interface1 {}

class Class4ExtendsClass1ImplementsInterface1
    extends Class1 implements Interface1 {}

