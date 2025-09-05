package main.java.workbook2.classdesign;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return width * height;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        Rectangle rect = new Rectangle(w, h);

        System.out.print(rect.getArea());
    }
}
