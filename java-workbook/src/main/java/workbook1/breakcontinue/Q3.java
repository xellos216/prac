package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x < 0) break;
            if (x > 0) {count++; sum += x;}
            }
            System.out.println((float) sum / count);
        }
    }
