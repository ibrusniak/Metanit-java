
public class EqualsDemo {

    public static void main(String[] args) {
        
        MyClass obj1 = new MyClass(100);
        MyClass obj2 = new MyClass(300);
        MyClass obj3 = new MyClass(100);

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));
        System.out.println(obj2.equals(obj3));
    }
}

class MyClass {

    private int i;

    MyClass(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof MyClass)) {
            return false;
        } 
        return this.i == ((MyClass)obj).i;
    }
}

