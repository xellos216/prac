package main.java.workbook3.thissuper;

import java.util.Scanner;

class Box {
    int width, height, depth;

    Box() {
        this.width = 1;
        this.height = 1;
        this.depth = 1;
    }

    Box(int w, int h, int d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int d = sc.nextInt();
        Box b1 = new Box();
        Box b2 = new Box(w, h, d);
        System.out.println(b1.width + " " + b1.height + " " + b1.depth);
        System.out.println(b2.width + " " + b2.height + " " + b2.depth);
    }
}