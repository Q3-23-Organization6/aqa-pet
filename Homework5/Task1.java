package Homework5;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "Tenet";
        String str2 = str1.toLowerCase();
        char[] result = str2.toCharArray();
        int length = result.length;
        boolean palindrome = true;
        for (int i = 0; i < result.length/2; i++) {
            if (result[i] != result[length - i -1])  {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("Word " + str1 + " is a Palindrome");
        } else {
            System.out.println("Word " + str1 + " is not a Palindrome");
        }

    }
}