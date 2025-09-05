package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q3 {
    public static int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) newArr[i] = arr[i];
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] original = new int[n];
        for (int i = 0; i < n; i++) original[i] = sc.nextInt();

        int[] copy = copyArray(original);
        for (int i = 0; i < n; i++) original[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(copy[i]);
        }
    }
}
