package main.java.workbook3.exception;

import java.util.Scanner;

class NegativeAgeException extends Exception {
    NegativeAgeException(String msg) {
        super(msg);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 0) {
                throw new NegativeAgeException("Invalid age");
            } else {
                System.out.println("Your age: " + age);
            }
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}