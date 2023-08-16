package step2;

public class Calculator2 {
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
            case "%":
                yield (double) firstName % secondNumber;
            default:
                throw new IllegalStateException();
        };
    }
}
