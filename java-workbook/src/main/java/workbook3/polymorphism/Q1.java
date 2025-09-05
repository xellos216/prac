package main.java.workbook3.polymorphism;

import java.util.Scanner;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal[] animals = new Animal[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            animals[i] = t.equals("dog") ? new Dog() : new Cat();
        }
        for (Animal a : animals) {
            a.sound();
        }
    }
}
