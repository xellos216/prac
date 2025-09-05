package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q4 {
    public static double area(double r) {
        return 2 * Math.PI * r;
    }

    public static double area(double w, double h) {
        return w * h;
    }

    public static double area(double base, double height, boolean isTriangle) {
        return base * height * 0.5;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            if (type.equals("circle")) {
                double r = sc.nextDouble();
                System.out.println(area(r));
            } else if (type.equals("rect")) {
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                System.out.println(area(w, h));
            } else {
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                System.out.println(area(b, h, true));
            }
        }
    }
}