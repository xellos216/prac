package main.java.workbook2.methodcompare;

import java.util.Scanner;

class MathUtil {
    static int square(int n) {
        return n * n;
    }
    int cube(int n) {
        return n * n * n;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = MathUtil.square(n);
        MathUtil util = new MathUtil();
        int cu = util.cube(n);

        System.out.println(sq + " " + cu);
    }
}
