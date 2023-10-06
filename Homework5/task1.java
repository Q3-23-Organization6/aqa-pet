package Homework5;
public class task1 {
    public static void main(String[] args) {
        String str1 = "Tenet";
        String str2 = str1.toLowerCase();
        char[] result = str2.toCharArray();
        int l = result.length;
        boolean pal = true;
        for (int i = 0; i < result.length/2; i++) {
            if (result[i] != result[l - i -1])  {
                pal = false;
                break;
            }
        }
        if (pal) {
            System.out.println("Word " + str1 + " is a Palindrome");
        } else {
            System.out.println("Word " + str1 + " is not a Palindrome");
        }

    }
}