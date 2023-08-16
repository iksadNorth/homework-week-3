import step1.Calculator1;
import step2.Calculator2;
import step3.Calculator3;
import step4.AbstractOperation;
import step4.AddOperation;
import step4.Calculator4;

public class Main {
    public static void main(String[] args) {
        // step1
        Calculator1 calculator1 = new Calculator1();
        double calculated1 = calculator1.calculate("+", 1, 2);
        double calculated2 = calculator1.calculate("-", 1, 2);
        double calculated3 = calculator1.calculate("*", 1, 2);
        double calculated4 = calculator1.calculate("/", 1, 2);

        // step2
        Calculator2 calculator2 = new Calculator2();
        double calculated5 = calculator2.calculate("%", 1, 2);

        // step3
        Calculator3 calculator3 = new Calculator3();
        double calculated6 = calculator3.calculate("+", 1, 2);
        double calculated7 = calculator3.calculate("-", 1, 2);
        double calculated8 = calculator3.calculate("*", 1, 2);
        double calculated9 = calculator3.calculate("/", 1, 2);

        // step4
        AbstractOperation abstractOperation = new AddOperation();
        Calculator4 calculator4 = new Calculator4(abstractOperation);
        double calculated10 = calculator4.calculate(1, 2);
    }
}
