public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        return a / b;
    }

    public double modulus(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Cannot perform modulus by zero.");
        }

        return a % b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double squareRoot(double a) {

        if (a < 0) {
            throw new ArithmeticException("Square root of a negative number is not allowed.");
        }

        return Math.sqrt(a);
    }
}
