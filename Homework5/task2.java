package Homework5;
public class task2 {
    public static void main(String[] args) {
        int[] arraySnd = {32, -2, 5, 99, 22};
        int min = arraySnd[0];
        int max;
        for(max = 0; max < arraySnd.length - 1; ++max) {
            if (min > arraySnd[max]) {
                min = arraySnd[max];
            }
        }
        System.out.println("Min number of Array is " + min);
        max = arraySnd[0];
        for(int num = 0; num < arraySnd.length - 1; ++num) {
            if (max < arraySnd[num]) {
                max = arraySnd[num];
            }
        }
        System.out.println("Max number of Array is " + max);
    }
}