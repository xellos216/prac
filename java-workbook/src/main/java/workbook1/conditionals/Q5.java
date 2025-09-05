package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b || b == c || c == a) {
            System.out.print("같은 수 존재");
        } else if (a > b && a > c) {
            System.out.print(a);
        } else if (b > a && b > c) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }
    }
}