package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q6 {
    public static String addExclamation(String s) {
        return s + "!";
    }

    public static StringBuilder addExclamation(StringBuilder sb) {
        return sb.append("!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(sc.next());
        s = addExclamation(s);
        addExclamation(sb);

        System.out.print(s + " " + sb);
    }
}