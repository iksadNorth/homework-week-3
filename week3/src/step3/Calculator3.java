package step3;

public class Calculator3 {
    public AddOperation addOperation = new AddOperation();
    public SubstractOperation substractOperation = new SubstractOperation();
    public MultiplyOperation multiplyOperation = new MultiplyOperation();
    public DivideOperation divideOperation = new DivideOperation();

    public double calculate(String opr, int firstName, int secondNumber) {
        return switch (opr) {
            case "+":
                yield addOperation.operate(firstName, secondNumber);
            case "-":
                yield substractOperation.operate(firstName, secondNumber);
            case "*":
                yield multiplyOperation.operate(firstName, secondNumber);
            case "/":
                yield divideOperation.operate(firstName, secondNumber);
            default:
                throw new IllegalStateException();
        };
    }
}
