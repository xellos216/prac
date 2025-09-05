package main.java.workbook3.accesslevel;

import java.util.Scanner;

class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        Student s = new Student();
        s.setName(n);
        System.out.println(s.getName());
    }
}