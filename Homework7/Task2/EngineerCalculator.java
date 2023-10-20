package Homework7.Task2;

class EngineerCalculator extends Calculator {
    public double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: root of a negative number");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }
}
