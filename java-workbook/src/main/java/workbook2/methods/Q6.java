package main.java.workbook2.methods;

import java.util.Scanner;

public class Q6 {
    public static int factorial(int n) {
        if(n==0) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factorial(n));
    }
}
