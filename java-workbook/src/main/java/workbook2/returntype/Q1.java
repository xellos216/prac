package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q1 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(add(a, b));
    }
}