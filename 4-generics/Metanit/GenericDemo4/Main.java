
public class Main {

    public static void main(String[] args) {
        
        Class1<Integer> obj1 = new Class1<Integer>();
        Class2<Class1<Integer>> obj2 = new Class2<Class1<Integer>>();
    }
}

class Class1 <Type extends Number> {}


class Class2 <Type extends Class1<Integer>> {}


