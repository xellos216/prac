package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int threetotal = 0;

        do {
            if (i % 3 == 0) {
                threetotal += i;
            }
            i++;
        } while (i <= n);
        System.out.println(threetotal);
    }
}
