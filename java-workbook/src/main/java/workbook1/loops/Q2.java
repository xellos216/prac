package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long oddTotal = 0;
        long evenTotal = 0;

        for (int i = 1; i <= n; i += 2) oddTotal += i;
        for (int i = 2; i <= n; i += 2) evenTotal += i;
        System.out.println(oddTotal + " " + evenTotal);
    }
}


