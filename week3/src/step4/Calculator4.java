package step4;

public class Calculator4 {
    public AbstractOperation abstractOperation;

    public Calculator4(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }

    public double calculate(int firstName, int secondNumber) {
        return abstractOperation.operate(firstName, secondNumber);
    }
}
