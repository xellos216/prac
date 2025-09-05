package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q2 {
    public static int max (int a, int b) {
        return Math.max(a, b);
    }

    public static int max (int a, int b, int c) {
        return max(a, max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(max(a,b));
        System.out.println(max(a,b,c));
    }
}