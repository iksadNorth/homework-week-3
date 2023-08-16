package step4;

public class DivideOperation implements AbstractOperation {
    public double operate(int firstName, int secondNumber) {
        return (double) firstName / secondNumber;
    }
}
