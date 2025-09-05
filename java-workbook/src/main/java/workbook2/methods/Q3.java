package main.java.workbook2.methods;

import java.util.Scanner;

public class Q3 {
    public static int[] addArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) result[i] = arr1[i] + arr2[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < n; i++) arr2[i] = sc.nextInt();

        int[] result = addArrays(arr1, arr2);
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(result[i]);
        }
    }
}

