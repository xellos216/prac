package main.java.workbook3.constructor;

import java.util.Scanner;

class Employee {
    String name;
    String dept;
    int salary;

    Employee() {
        this.name = "unknown";
        this.dept = "unknown";
        this.salary = 0;
    }

    Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    Employee(String name) {
        this.name = name;
        this.dept = "unknown";
        this.salary = 0;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        String dept1 = sc.next();
        int sal1 = sc.nextInt();
        String name2 = sc.next();
        Employee e1 = new Employee();
        Employee e2 = new Employee(name1, dept1, sal1);
        Employee e3 = new Employee(name2);
        System.out.println(e1.name + " " + e1.dept + " " + e1.salary);
        System.out.println(e2.name + " " + e2.dept + " " + e2.salary);
        System.out.println(e3.name + " " + e3.dept + " " + e3.salary);
    }
}
