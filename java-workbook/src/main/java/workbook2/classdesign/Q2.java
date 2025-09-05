package main.java.workbook2.classdesign;

import java.util.Scanner;

class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double getCircumference() {
        return 2 * Math.PI * r;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        System.out.print(c.getCircumference());
    }
}
