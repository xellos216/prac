package main.java.workbook3.collections;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++) list.add(i);

        for (int i = list.size() - 1; i >= 0; i--) System.out.print(list.get(i) + " ");
    }
}