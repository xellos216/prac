package main.java.workbook3.constructor;

import java.util.Scanner;

class Student {
    String name;

    Student() {
        name = "unknown";
    }

    Student(String name) {
        this.name = name;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Student s1 = new Student();
        Student s2 = new Student(name);

        System.out.println(s1.name);
        System.out.print(s2.name);
    }
}
