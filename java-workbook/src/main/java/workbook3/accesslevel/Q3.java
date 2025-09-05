package main.java.workbook3.accesslevel;

import java.util.Scanner;

class Employee {
    public String name;
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        int s1 = sc.nextInt();
        String n2 = sc.next();
        int s2 = sc.nextInt();
        int raise = sc.nextInt();
        Employee e1 = new Employee(n1, s1);
        Employee e2 = new Employee(n2, s2);
        e1.setSalary(e1.getSalary() + raise);
        System.out.println(e1.getSalary() + " " + e2.getSalary());
    }
}
