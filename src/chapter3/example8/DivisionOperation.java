package chapter3.example8;

public class DivisionOperation extends AbstractOperation {
    public DivisionOperation(int operandA, int operandB) {
        super(operandA, operandB);
    }
    public OperationResult accept(int operandA, int operandB) {
        return new OperationResult(operandA, operandB, (double)operandA / (double)operandB);
    }
}
