package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int avg = (s1+s2+s3)/3;

        if (avg >= 90) {
            System.out.print("A");
        } else if (avg >= 80) {
            System.out.print("B");
        } else if (avg >= 70) {
            System.out.print("C");
        } else if (avg >= 60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}