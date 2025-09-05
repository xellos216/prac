package main.java.workbook3.thissuper;

import java.util.Scanner;

class Person {
    String name;
    int
            age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.println(name + " " + age);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int a = sc.nextInt();
        Person p = new Person(n, a);
        p.printInfo();
    }
}