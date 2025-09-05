package main.java.workbook1.operators;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: a += b * c 연산 후 a, b, c 출력
        a += b * c;
        System.out.println(a + " " + b + " " + c);
    }
}