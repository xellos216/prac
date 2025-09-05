package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Draw Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Draw Rectangle");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] arr = new Shape[3];
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            if (type.equals("circle")) {
                arr[i] = new Circle();
            } else {
                arr[i] = new Rectangle();
            }
        }
        for (Shape s : arr) {
            s.draw();
        }
    }
}