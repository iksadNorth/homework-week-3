package step4;

public class SubstractOperation implements AbstractOperation {
    public double operate(int firstName, int secondNumber) {
        return (double) firstName - secondNumber;
    }
}
