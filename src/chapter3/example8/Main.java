package chapter3.example8;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        AbstractOperation op;
        
        op = new MultiplicationOperation(10, 3);
        AbstractOperation.OperationResult result = op.getResult();
        printf("Operands: {%s} {%s}; result: {%f}%n", result.getoperandA(), result.getoperandB(), result.getResult());
        
        op = new DivisionOperation(10, 3);
        result = op.getResult();
        printf("Operands: {%s} {%s}; result: {%f}%n", result.getoperandA(), result.getoperandB(), result.getResult());
    }
}