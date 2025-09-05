package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.print("양수");
        } else if (num == 0) {
            System.out.print("0");
        } else {
            System.out.print("음수");
        }
    }
}
