package main.java.workbook1.loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

// 바깥 for의 i 값이 증가하면 (i++), 안쪽 for 조건 j < h - i에 적용되어 반복 횟수가 줄어듬

