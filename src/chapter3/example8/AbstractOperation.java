package chapter3.example8;

public abstract class AbstractOperation {

    private OperationResult result;

    public AbstractOperation(int operandA, int operandB) {
        result = accept(operandA, operandB);
    }

    public static class OperationResult {
        private int operandA;
        private int operandB;
        private double result;

        protected OperationResult(int operandA, int operandB, double result) {
            this.operandA = operandA;
            this.operandB = operandB;
            this.result = result;
        }

        public double getResult() {
            return result;
        }
        public int getoperandA() {
            return operandA;
        }
        public int getoperandB() {
            return operandB;
        }
    }

    public OperationResult getResult() {
        return result;
    }

    public abstract OperationResult accept(int operandA, int operandB);
}