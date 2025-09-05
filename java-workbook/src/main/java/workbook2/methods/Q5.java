package main.java.workbook2.methods;

import java.util.Scanner;

public class Q5 {
    public static String[] reverseStrings(String[] arr) {
        int n = arr.length;
        String[] res = new String[n];
        for (int i = 0; i < n; i++) res[i] = new StringBuilder(arr[i]).reverse().toString();
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) words[i] = sc.next();

        String[] reversed = reverseStrings(words);
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(reversed[i]);
        }
    }
}