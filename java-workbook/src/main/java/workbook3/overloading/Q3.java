package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q3 {
    public static String concat(String s1, String s2) {
        return new StringBuilder().append(s1).append(s2).toString();
    }

    public static String concat(String s1, String s2, String s3) {
        return new StringBuilder().append(s1).append(s2).append(s3).toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        System.out.println(concat(s1,s2));
        System.out.println(concat(s1,s2,s3));
    }
}
