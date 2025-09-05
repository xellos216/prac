package main.java.workbook3.thissuper;

import java.util.Scanner;

class Employee {
    String name, dept;
    int salary;

    Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    void printInfo() {
        System.out.print("Name: " + name + ", Dept: " + dept + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String team;

    Manager(String name, String dept, int salary, String team) {
        super(name, dept, salary);
        this.team = team;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(", Team: " + team);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String d = sc.next();
        int s = sc.nextInt();
        String t = sc.next();
        Manager m = new Manager(n, d, s, t);
        m.printInfo();
    }
}
