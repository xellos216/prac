package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 1; i <= n; i++) {
            int sum = 0;
            int total = i;
            while (total > 0) {
                sum += total % 10;
                total /= 10;
            }
            if (sum % 5 == 0) count++;
        }
        System.out.println(count);
    }
}