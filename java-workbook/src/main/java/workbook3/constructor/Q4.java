package main.java.workbook3.constructor;

import java.util.Scanner;

class Triangle {
    int a, b, c;
    Triangle() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(a, b, c);
        System.out.println(t1.a + " " + t1.b + " " + t1.c);
        System.out.println(t2.a + " " + t2.b + " " + t2.c);
    }
}
