package main.java.workbook1.operators;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: 산술 연산자(+, -, *, /, %) 결과 출력
        System.out.print(a+b + " ");
        System.out.print(a-b + " ");
        System.out.print(a*b + " ");
        System.out.print(a/b + " ");
        System.out.print(a%b);
    }
}