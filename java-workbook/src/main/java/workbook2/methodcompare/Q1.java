package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Calculator {
    static int add(int a, int b) {
        return a + b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = Calculator.add(x, y);
        Calculator calc = new Calculator();
        int prod = calc.multiply(x, y);

        System.out.println(sum + " " + prod);
    }
}
