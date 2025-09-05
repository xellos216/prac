package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q1 {
    public static void printValue(int i) {
        System.out.println(i);
    }
    public static void printValue(double i) {
        System.out.println(i);
    }
    public static void printValue(String i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        String s = sc.next();

        printValue(i);
        printValue(d);
        printValue(s);
    }
}
