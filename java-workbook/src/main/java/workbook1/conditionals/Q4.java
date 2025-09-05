package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if  (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.print("윤년");
        } else {
            System.out.print("!=윤년");
        }
    }
}
