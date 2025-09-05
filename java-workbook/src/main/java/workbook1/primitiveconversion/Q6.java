package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int a = Integer.parseInt(s1); // cast String s1 to int
        int b = Integer.parseInt(s2); // cast String s2 to int

        System.out.println((byte)(a - b)); // cast a, b to int and minus

        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력
    }
}

// Note: (byte)(a - b) != (byte)a - (byte)b
// Note: byte, short 끼리 연산은 자동으로 int 승격 (Java spec)