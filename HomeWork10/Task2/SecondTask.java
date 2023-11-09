package HomeWork10.Task2;

import java.util.ArrayList;
import java.util.List;

public class SecondTask {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(3);
        list.add(85);
        list.add(2);
        list.add(17);
        list.add(37);
        list.add(68);
        list.add(9);
        int x = 10;

        System.out.println("Original list: " + list);

        newList(list, x);
        System.out.println("Reordered list: " + list);
    }

    public static void newList(List<Integer> list, int x) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            while (list.get(left) <= x) {
                left++;
            }
            while (list.get(right) > x) {
                right--;
            }
            if (left < right) {
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
            }
        }
    }
}
