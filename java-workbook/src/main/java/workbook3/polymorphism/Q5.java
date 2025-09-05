package main.java.workbook3.polymorphism;

import java.util.Scanner;

abstract class Polygon {
    abstract double area();
    abstract double perimeter();
}

class Triangle extends Polygon {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area() {
        return Math.sqrt(perimeter() / 2 * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c));
    }

    double perimeter() {
        return a + b + c;
    }
}

class Rectangle extends Polygon {
    double w, h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    double area() {
        return w * h;
    }

    double perimeter() {
        return 2 * (w + h);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Polygon p = null;
        for (int i = 0; i < k; i++) {
            String t = sc.next();
            if (t.equals("triangle")) {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                p = new Triangle(a, b, c);
            }  else if (t.equals("rect")) {
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                p = new Rectangle(w, h);
            }
            System.out.println(p.area() + " " + p.perimeter());
        }
    }
}
