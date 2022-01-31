
class LambdasAsMethodResultsDemo {

    public static void main(String[] args) {

        Double arg1 = 200d;
        Double arg2 = 340d;

        System.out.println(getMathOperation("fail").execute(arg1, arg2));
        System.out.println(getMathOperation("substraction").execute(arg1, arg2));
        System.out.println(getMathOperation("multiplication").execute(arg1, arg2));
        System.out.println(getMathOperation("addition").execute(arg1, arg2));
        System.out.println(getMathOperation("division").execute(arg1, arg2));
    }

    private static MathOperation getMathOperation(String operationString) {

        switch (operationString) {

            case "addition" : return (n, m) -> n + m;
            case "substraction" : return (n, m) -> n - m;
            case "multiplication" : return (n, m) -> n * m;
            case "division" : return (n, m) -> n / m;
            default : return (n, m) -> 0d;
        }
    }
}

interface MathOperation {
    public Double execute(Double argument1, Double argument2);
}

