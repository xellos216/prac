package main.java.workbook3.collections;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        System.out.println();
        System.out.println(list);
        System.out.println();
        for (String s : list) System.out.println(s);
    }
}