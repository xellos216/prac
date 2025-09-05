package main.java.workbook3.polymorphism;

import java.util.Scanner;

interface Renderer {
    void render();
}

class SquareRenderer implements Renderer {
    public void render() {
        System.out.println("Render square");
    }
}

class CircleRenderer implements Renderer {
    public void render() {
        System.out.println("Render circle");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Renderer[] arr = new Renderer[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            if (t.equals("square")) arr[i] = new SquareRenderer();
            else arr[i] = new CircleRenderer();
        }

        for (Renderer r : arr) {
            r.render();
        }
    }
}
