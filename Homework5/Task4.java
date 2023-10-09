package Homework5;

public class Task4 {
    public static void main(String[] args) {
        double[] arrayFth = new double[37];
        double x = 0;
        int step = 10;
        for(int i = 0; i < arrayFth.length -1; ++i) {
            arrayFth[i] = x;
            x = arrayFth[i] + step;
            arrayFth[i] = Math.sin(x);
            System.out.println("Sin of " + x + " degrees = " + arrayFth[i] + " rad");
        }
    }
}