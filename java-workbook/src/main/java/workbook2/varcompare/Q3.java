package main.java.workbook2.varcompare;

import java.util.Scanner;

class Student {
    static int studentCount = 0;
    int id;
    String name;
    Student(String name) {
        studentCount++;
        this.id = studentCount;
        this.name = name;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            Student stu = new Student(name);
            System.out.println(stu.name + " " + stu.id);
        }
    }
}