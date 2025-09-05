package main.java.workbook3.exception;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            int num = Integer.parseInt(s);
            System.out.println( num * 2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
    }
}