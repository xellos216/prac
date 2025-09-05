package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        int a = (int) x; // cast x to int
        int b = (int) y; // cast y to int
        int c = (int) z; // cast z to int
        float avg = (float)(a + b + c) / 3; // Calculate avg

        System.out.println("The average is " + avg);

        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력
    }
}
