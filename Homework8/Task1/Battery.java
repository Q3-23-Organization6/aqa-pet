package Homework8.Task1;

public class Battery {
    private int level;

    public Battery() {
        level = 100;
    }

    public int getLevel() {
        return level;
    }

    public void consumeBattery(int amount) {
        if (level >= amount) {
            level -= amount;
        } else {
            level = 0;
        }
    }
}
