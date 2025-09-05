package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();

        int a = (int) f1; // cast f1 to int

        System.out.println((double)a + f2); // cast a to double, f2 is promoted to double automatically

      // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력
    }
}
