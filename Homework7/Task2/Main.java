package Homework7.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator basicCalculator = new Calculator();
        EngineerCalculator engineerCalculator = new EngineerCalculator();
        ProgrammableCalculator programmableCalculator = new ProgrammableCalculator();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Sum: " + basicCalculator.add(num1, num2));
        System.out.println("Difference: " + basicCalculator.subtract(num1, num2));
        System.out.println("Product: " + basicCalculator.multiply(num1, num2));
        System.out.println("Part: " + basicCalculator.divide(num1, num2));

        System.out.print("Enter a number to calculate the square root of: ");
        double sqrtInput = scanner.nextDouble();
        System.out.println("Square root: " + engineerCalculator.squareRoot(sqrtInput));

        System.out.print("Enter a number to calculate the degree: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the degree: ");
        double exponent = scanner.nextDouble();
        System.out.println("Raised to the degree: " + engineerCalculator.power(base, exponent));

        System.out.print("Enter a number to store in memory: ");
        double memoryValue = scanner.nextDouble();
        programmableCalculator.storeInMemory(memoryValue);

        System.out.println("Values in memory: " + programmableCalculator.recallFromMemory());

        scanner.close();
    }


}