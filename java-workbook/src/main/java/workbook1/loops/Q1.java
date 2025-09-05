package main.java.workbook1.loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        long total = 0;

        while (i <= n) {
            total += i;
            i++;
        }
        System.out.print(total);
    }
}


