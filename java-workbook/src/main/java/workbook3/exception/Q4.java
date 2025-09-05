package main.java.workbook3.exception;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        try {
            if (op.equals("+")) {
                System.out.printf("%d + %d = %d ", a, b, a + b);
            } else if (op.equals("-")) {
                System.out.printf("%d - %d = %d ", a, b, a - b);
            } else if (op.equals("*")) {
                System.out.println(a + " * " + b + " = " + a * b);
            } else if (op.equals("/")) {
                if (b == 0) throw new ArithmeticException();
                System.out.println(a + " / " + b + " = " + a / b);
            } else {
                throw new Exception();
            }
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (Exception e) {
            System.out.println("Invalid operator");
        }
    }
}
