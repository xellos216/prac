package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int pos = 0;
        int neg = 0;

        for (int i = 1; i <= count; i++) {
            int num = sc.nextInt();
            if (num > 0) pos ++;
            else neg += num;
        }
        System.out.printf(pos + " " + neg);
    }
}