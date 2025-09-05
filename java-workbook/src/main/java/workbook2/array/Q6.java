package main.java.workbook2.array;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        int num = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = num++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    arr[i][j] = num++;
                }
            }
        }

        for (int[] row : arr) {
            for (int n : row) {
                System.out.printf(n + " ");
            }
            System.out.println("");
        }
    }
}

// 바깥 for (int[] row : arr) → 2차원 배열에서 **한 행(row)**씩 꺼냄
// 안쪽 for (int n : row) → 그 행의 **각 열 값(n)**을 차례대로 꺼냄
// → 전체 2차원 배열을 행 단위, 열 단위로 순서대로 출력