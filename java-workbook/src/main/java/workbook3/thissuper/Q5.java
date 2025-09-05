package main.java.workbook3.thissuper;

import java.util.Scanner;

class Vehicle {
    String model;
    int year;

    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;

    }
    public String toString() {
        return "Model: " + model + ", Year: " + year;
    }
}

class Car extends Vehicle {
    String fuel;

    Car(String model, int year, String fuel) {
        super(model, year);
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "Fuel: " + fuel;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.next();
        int year = sc.nextInt();
        String fuel = sc.next();
        Car car = new Car(model, year, fuel);
        System.out.println(car);
    }
}
