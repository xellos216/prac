package main.java.workbook3.genericenum;

import java.util.Scanner;

public class Q3 {
    static <T extends Number> double sumNumbers(T[] arr) {
        double total = 0.0;
        for (T num : arr) {
            total += num.doubleValue();
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number[] nums = new Number[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextDouble();
        }
        System.out.println(sumNumbers(nums));
    }
}
