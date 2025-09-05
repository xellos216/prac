package main.java.workbook2.methods;

import java.util.Scanner;

public class Q2 {
    public static int stringLength(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(stringLength(str));
    }
}
