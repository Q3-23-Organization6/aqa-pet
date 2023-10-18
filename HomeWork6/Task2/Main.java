package HomeWork6.Task2;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = Calculator.add(num1, num2);
        int difference = Calculator.subtract(num1, num2);
        int product = Calculator.multiply(num1, num2);
        double quotient = Calculator.divide(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}