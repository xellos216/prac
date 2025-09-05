package main.java.workbook2.methodcompare;

import java.util.Scanner;

class StringUtil {
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
            return true;

//      String reversed = new StringBuilder(s).reverse().toString();
//      return s.equals(reversed);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean isPalindrome = StringUtil.isPalindrome(str);
        System.out.println(isPalindrome);
    }
}
