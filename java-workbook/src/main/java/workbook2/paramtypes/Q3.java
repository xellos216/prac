package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q3 {
    public static void swapStrings(String[] arr) {
        String temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String[] arr = {s1, s2};

        swapStrings(arr);
        System.out.println(arr[0] + " " + arr[1]);
    }
}
