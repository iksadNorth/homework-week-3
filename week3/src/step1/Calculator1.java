package step1;

public class Calculator1 {
    public double calculate(String opr, int firstName, int secondNumber) {
        return switch (opr) {
            case "+":
                yield (double) firstName + secondNumber;
            case "-":
                yield (double) firstName - secondNumber;
            case "*":
                yield (double) firstName * secondNumber;
            case "/":
                yield (double) firstName / secondNumber;
            default:
                throw new IllegalStateException();
        };
    }
}
