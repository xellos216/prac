package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q2 {
    public static void addHundred(int[] arr) {
        if (arr.length > 0) arr[0] += 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        addHundred(arr);
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i] + " ");
        }
    }
}