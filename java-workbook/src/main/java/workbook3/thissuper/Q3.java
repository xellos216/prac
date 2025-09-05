package main.java.workbook3.thissuper;

import java.util.Scanner;

class Animal {
    String name;

    Animal(String name) {
        System.out.println("Animal constructor");
        this.name = name;
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
        System.out.println("Dog constructor");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
         Dog dog = new Dog(n);
         System.out.println(dog.name);
    }
}