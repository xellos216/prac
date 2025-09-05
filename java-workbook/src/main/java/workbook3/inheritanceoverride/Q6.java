package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

abstract class Employee {
    abstract double getPay();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double getPay() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate, hours;

    PartTimeEmployee(double hourlyRate, double hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    double getPay() {
        return (hourlyRate * hours);
    }

}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type1 = sc.next();
        Employee e1;
        if (type1.equals("full")) {
            double salary = sc.nextDouble();
            e1 = new FullTimeEmployee(salary);
        } else {
            double rate = sc.nextDouble();
            double h = sc.nextDouble();
            e1 = new PartTimeEmployee(rate, h);
        }

        String type2 = sc.next();
        Employee e2;
        if (type2.equals("full")) {
            double salary = sc.nextDouble();
            e2 = new FullTimeEmployee(salary);
        } else {
            double rate = sc.nextDouble();
            double h = sc.nextDouble();
            e2 = new PartTimeEmployee(rate, h);
        }

        System.out.println(e1.getPay());
        System.out.println(e2.getPay());
    }
}
