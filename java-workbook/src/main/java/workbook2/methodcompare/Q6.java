package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Vector2D {
    double x;
    double y;

    Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    static double distance(Vector2D a, Vector2D b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt (dx * dx + dy * dy);
//      return Math.hypot(a.x - b.x, a.y - b.y);
    }

    void add(Vector2D other) {
        this.x += other.x;
        this.y += other.y;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Vector2D v1 = new Vector2D(x1, y1);
        Vector2D v2 = new Vector2D(x2, y2);
        double dist = Vector2D.distance(v1, v2);
        System.out.println(dist);
        System.out.println(v1.x + " " + v1.y);

        v1.add(v2);
        System.out.println(v1.x + " " + v1.y);
    }
}
