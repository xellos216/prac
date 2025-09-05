package main.java.workbook3.genericenum;

import java.util.Scanner;

public class Q2 {
    static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = {sc.next(), sc.next()};
        Integer[] intArr = {sc.nextInt(), sc.nextInt()};
        swap(strArr, 0, 1);
        swap(intArr, 0, 1);
        System.out.println(strArr[0] + " " + strArr[1]);
        System.out.println(intArr[0] + " " + intArr[1]);
    }
}