package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();

        long sum = b + s + i + l; // promote b, s, i to long and sum

        System.out.println((float)sum); // cast sum to float

        // TODO: b, s, i, l을 long으로 변환해 합산 후 float으로 변환하여 출력
    }
}