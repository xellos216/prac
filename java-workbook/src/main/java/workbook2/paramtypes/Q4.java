package main.java.workbook2.paramtypes;

import java.util.Scanner;

class Person {
    String name;
    Person(String name) { this.name = name; }
}

public class Q4 {
    public static void changeName(Person p, String newName) {
        p.name = newName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oldName = sc.next();
        String newName = sc.next();
        Person p = new Person(oldName);
        changeName(p, newName);
        System.out.print(p.name);
    }
}