package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        int a = (int) d; // cast d to int

        System.out.println(d-a); // print difference between double and int

        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력
    }
}