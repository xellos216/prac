package main.java.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];

        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextDouble();

        double max = arr[0];
        double min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println(max + " " + min);
    }
}