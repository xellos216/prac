package main.java.workbook3.constructor;

import java.util.Scanner;

class Car {
    String model;
    int price;

    Car() {
        this.model = "unknown";
        this.price = 0;
    }

    Car(String model, int price) {
        this.model = model;
        this.price = price;
    }
    Car(int price) {
        this.model = "unknown";
        this.price = price;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        Car c1 = new Car();
        Car c2 = new Car(m, p1);
        Car c3 = new Car(p2);
        System.out.println(c1.model + " " + c1.price);
        System.out.println(c2.model + " " + c2.price);
        System.out.println(c3.model + " " + c3.price);
    }
}