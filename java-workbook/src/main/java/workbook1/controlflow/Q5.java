package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num >= 10) {
            int total = 0;
            while (num > 0) {
                total += num % 10;
                num /= 10;
            }
            num = total;
        }
        System.out.print(num);
    }
}