package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q1 {
    public static int primitiveParam(int x) {
        return x + 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = primitiveParam(x);
        System.out.print(x + " ");
        System.out.print(result);
    }
}