package thuchanh1;

public class CalculatorTest extends Calculator {
    int firstNumber;
    int secondNumber;
    char operator;
    int expected = Calculator.calculate(firstNumber, secondNumber, operator);
    char EQUAL = '=';
    int testCalculateAdd() {
        firstNumber = 1;
        secondNumber = 1;
        operator = ADDITION;
        return expected;
    }

    int testCalculateSub() {
        firstNumber = 2;
        secondNumber = 1;
        operator = SUBTRACTION;
        return expected;
    }

    int testCalculateMul() {
        firstNumber = 2;
        secondNumber = 2;
        operator = MULTIPLY;
        return expected;
    }

    int testCalculateDiv() {
        firstNumber = 6;
        secondNumber = 3;
        operator = DIVISION;
        return expected;

    }

    int testCalculateDivByZero() {
        firstNumber = 2;
        secondNumber = 0;
        operator = DIVISION;
        return expected;
    }

    int testCalculateWrongOperator() {
        firstNumber = 2;
        secondNumber = 0;
        operator = EQUAL;
        return expected;
    }
}
