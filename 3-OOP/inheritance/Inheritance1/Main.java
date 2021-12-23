
public class Main {

    public static void main(String[] args) {
        
        Factorial fac1 = new Factorial(5);
        Fibonacci fib1 = new Fibonacci(10);
        fac1.printArguments();
        fib1.printArguments();
        fac1.calculate();
        fib1.calculate();
        fac1.printResults();
        fib1.printResults();
    }
}

class Operation {
    
    protected Number[] arguments;
    protected Number[] results;

    public Operation(Number n) {
        addArgument(n);
    }

    public Operation(Number... arguments) {
        addArgument(arguments);
    }

    protected void addArgument(Number[] arguments) {
        
        for(Number n : arguments) {
            addArgument(n);
        }
    }

    protected void addArgument(Number n) {

        if(arguments == null) {
            arguments = new Number[] {n};
        } else {
            Number[] newArguments = new Number[arguments.length + 1];
            for(int i = 0; i < arguments.length; i++) {
                newArguments[i] = arguments[i];
            }
            newArguments[newArguments.length - 1] = n;
            arguments = newArguments;
        }
    }

    protected Number[] getArguments() {
        return arguments;
    }

    protected void printArguments() {

        System.out.printf("[%s][arguments]: ", this.getClass().getSimpleName());
        for(Number n : arguments) {
            System.out.printf(n + " ");
        }
        System.out.print("\n");
    }

    protected Number[] getResults() {
        return results;
    }

    protected void printResults() {
        
        for(Number n : getResults()) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }

    protected void calculate() {}
}

class Fibonacci extends Operation {

    Fibonacci(Integer argument) {
        super(argument);
    }

    @Override public void calculate() {
        results = getFibonacciSequence((Integer)arguments[0]);
    }

    private Integer[] getFibonacciSequence(Integer countOfNumbers) {

        if(countOfNumbers <= 1) {
            return new Integer[] {0};
        }

        switch (countOfNumbers) {
            
            case 1:
                return new Integer[] {0};
            case 2:
                return new Integer[] {0, 1};
        }

        Integer[] sequence = new Integer[countOfNumbers];
        sequence[0] = 0;
        sequence[1] = 1;
        
        for(int i = 2; i < sequence.length; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        return sequence;
    }
}

class Factorial extends Operation {

    Factorial(Integer argument) {
        super(argument);
    }

    @Override public void calculate() {
        results = new Integer[]
            {getFactorial((Integer)arguments[0])};
    }

    private Integer getFactorial(Integer num) {
        
        Integer result = 1;
        for(int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

