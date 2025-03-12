package Calculator;

public class CalculatorProxy implements Calculator {
    private MathCalculator calculator;
    @Override
    public double add(double a, double b) {
        if (a / 2 + b / 2 >= Double.MAX_VALUE / 2) {
          throw new RuntimeException("Out of Range");
        }
        if (a / 2 + b / 2 <= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of Range");
        }
        return calculator.add(a, b);
    }

    @Override
    public double sub(double a, double b) {
        if (a / 2 + b / 2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of Range");
        }
        if (a / 2 + b / 2 <= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of Range");
        }
        return calculator.sub(a, b);
    }

    @Override
    public double mul(double a, double b) {
       double result = calculator.mul(a, b);
       if (a != 0 && result / a != b) {
           throw new RuntimeException("Out of Range");
       }
        return result;
    }

    @Override
    public double div(double a, double b) {
        if (b == 0) {
            throw new RuntimeException("Can't divide by zero");
        }
        return calculator.div(a, b);
    }
}
