package Homework7.Task2;

class ProgrammableCalculator extends Calculator {
    private double memory = 0.0;

    public void storeInMemory(double value) {
        memory = value;
    }

    public double recallFromMemory() {
        return memory;
    }
}