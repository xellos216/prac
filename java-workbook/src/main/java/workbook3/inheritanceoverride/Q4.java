package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Hello, I'm " + name + ".");
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }

    void introduce() {
        System.out.println("Hello, I'm " + name + " " + "student.");
    }
}

class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }
    void introduce() {
        System.out.println("Hello, I'm " + name + " " +"teacher.");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type1 = sc.next();
        String name1 = sc.next();
        String type2 = sc.next();
        String name2 = sc.next();
        Person p1 = type1.equals("student") ? new Student(name1) : new Teacher(name1);
        Person p2 = type2.equals("student") ? new Student(name2) : new Teacher(name2);
        p1.introduce();
        p2.introduce();
    }
}