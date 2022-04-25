
// Generic lass research

public class GenDemo1 {

    public static void main(String[] args) {
        GenericClass1<Object> gc1 = new GenericClass1<Object>();
        System.out.println(gc1);
        System.out.println(gc1.getClass().getName());
        GenericClass1<String> gc2 = new GenericClass1<String>();
        System.out.println(gc2);
        System.out.println(gc2.getClass().getName());
        System.out.printf("\ngc2 is instance of GenericClass1: %s\n",
            gc2 instanceof GenericClass1);
        System.out.printf("\ngc2 is instance of GenericClass1<String>: %s\n",
            gc2 instanceof GenericClass1<String>);
        GenericClass1 gc3;
        gc3 = new GenericClass1();
        gc3 = gc1;
        System.out.println(gc3);
        // System.out.printf("\ngc3 is instance of GenericClass1<Object>: %s\n",
        //     gc3 instanceof GenericClass1<Object>);
    }
}

class GenericClass1<TypeParameter> {}

