package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Statistics {
    static int count = 0;
    static int sum = 0;

    void addNumber(int n) {
        sum += n;
        count++;
    }
    static double average() {
        return (double) sum / count;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Statistics stat = new Statistics();
        for (int i = 0; i < n; i++) stat.addNumber(sc.nextInt());

        System.out.println(Statistics.average());
    }
}