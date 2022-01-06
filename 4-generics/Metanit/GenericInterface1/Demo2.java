
public class Demo2 {

    public static void main(String[] args) {
        
        Factorial f = new Factorial(5);
        f.calculate();
        System.out.println(f);

        System.out.println();

        ICalculable[] ops = new ICalculable[] {
            new Factorial(5),
            new Factorial(2),
            new Square(4)
        };

        for(ICalculable i : ops) {
            
            i.calculate();
            System.out.println(i.getResults());
        }
    }
}

interface ICalculable<T> {
    void calculate();
    T getResults();
}

class Factorial implements ICalculable<Integer> {

    private Integer num;
    private Integer result;

    public Factorial(Integer i) {
        this.num = i;
    }

    @Override
    public void calculate() {
        
        int r = 1;
        for(int i = 1; i <= num; i++) {
            r *= i;
        }
        result = r;
    }

    @Override
    public Integer getResults() {
        return result;
    }

    @Override
    public String toString() {
        return result.toString();
    }
}

class Square implements ICalculable<Integer> {

    private Integer num;

    public Square(Integer i) {
        num = i;
    }

    @Override
    public void calculate() {
        num *= num;
    }

    @Override
    public Integer getResults() {
        return num;
    }
}
