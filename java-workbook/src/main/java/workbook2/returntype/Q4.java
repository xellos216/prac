package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q4 {
    public static String concatStrings(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(concatStrings(s1, s2));
    }
}