package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int multi = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else if (i % 2 != 0) {
                multi *= i;
            }
        }
        System.out.println(sum + " " + multi);
    }
}
