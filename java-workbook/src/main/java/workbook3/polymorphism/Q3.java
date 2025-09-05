package main.java.workbook3.polymorphism;

import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    double area() {
        return Math.PI * r * r;
    }
}

class Square extends Shape {
    double s;
    Square(double s) {
        this.s = s;
    }
    double area() {
        return s * s;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] list = new Shape[3];
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            if (type.equals("circle")) {
                list[i] = new Circle(sc.nextDouble());
            } else {
                list[i] = new Square(sc.nextDouble());
            }
        }
        for (Shape s : list) {
            System.out.println(s.area());
        }
    }
}