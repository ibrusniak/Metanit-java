
public class GenericClass2 {

    public static void main(String[] args) {
        
        // [unchecked] warning: [unchecked] unchecked call to Class2(T) as a member of the raw type Class2
        Class2 obj1 = new Class2(3.14);
        obj1.showInstanceInfo();

        // warning: [unchecked] unchecked call to Class2(T) as a member of the raw type Class2
        // warning: [unchecked] unchecked conversion
        Class2<Integer> obj2 = new Class2(200);
        obj2.showInstanceInfo();

        // Normal
        Class2 obj3 = new Class2<Integer>(200);
        obj3.showInstanceInfo();

        // Normal
        Class2<Object> obj4 = new Class2<Object>(new Object());
        obj4.showInstanceInfo();
    }    
}

class Class2<T> {

    T t;

    public Class2(T t) {
        this.t = t;
    }

    public void showInstanceInfo() {
        System.out.printf("\n%s %s\n",
            t.getClass().getName(),
            t);
    }
}

