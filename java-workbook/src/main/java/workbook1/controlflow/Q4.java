package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while (sc.hasNextInt()) {
            int num = sc.nextInt();

            if (num == 0) break;
            if (num > 0) total += num;
        }
        System.out.println(total);
    }
}
