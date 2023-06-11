package chapter3.example8;

public class MultiplicationOperation extends AbstractOperation {
    public MultiplicationOperation(int operandA, int operandB) {
        super(operandA, operandB);
    }
    public OperationResult accept(int operandA, int operandB) {
        return new OperationResult(operandA, operandB, operandA * operandB);
    }
}
