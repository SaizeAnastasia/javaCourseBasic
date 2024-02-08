package lessons.lessons_05;

public class CalculatorWithReturnResult {

public int sum(int a, int b) {
    int result = a + b;
    return result;
}

public int subtract(int a, int b) {
    int result = a - b;
    return result;
}

public int multiply(int a, int b) {
    int result = a * b;
    return result;
}

public double divide(int a, int b) {
    double result = (double) a / b;
        return result;

}

public static void main(String[] args) {
    CalculatorWithReturnResult calculator = new CalculatorWithReturnResult();

    int a = 10;
    int b = 5;

    int sumResult = calculator.sum(a, b);
    int subtractResult = calculator.subtract(a, b);
    int multiplyResult = calculator.multiply(a, b);
    double divideResult = calculator.divide(a, b);

    System.out.println("Sum: " + sumResult);
    System.out.println("Subtraction: " + subtractResult);
    System.out.println("Multiplication: " + multiplyResult);
    System.out.println("Division: " + divideResult);
}
}