package main.java.workbook3.constructor;

import java.util.Scanner;

class Point {
    int x, y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Point p1 = new Point();
        Point p2 = new Point(x, y);
        System.out.println(p1.x + " " + p1.y);
        System.out.println(p2.x + " " + p2.y);
    }
}
