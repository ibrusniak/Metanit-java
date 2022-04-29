
public class Ex1 {

    public static void main(String[] args) {

        Functional<Integer> f;
        Predicates<Integer> predicates = new Predicates<>();

        f = predicates::graterZero;
        System.out.println(f.check(0));

        f = predicates::lessZero;
        System.out.println(f.check(0));

        f = predicates::equalsZero;
        System.out.println(f.check(0));
    }
}

interface Functional<T extends Number> {
    boolean check(T n);
}

class Predicates<T extends Number> {

    boolean graterZero(T n) {
        return n.doubleValue() > 0;
    }

    boolean lessZero(T n) {
        return n.doubleValue() < 0;
    }

    boolean equalsZero(T n) {
        return n.doubleValue() == 0;
    }
}

