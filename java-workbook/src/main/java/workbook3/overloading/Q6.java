package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q6 {
    public static int multiply(int[] arr) {
        int result = 1;
        for (int n : arr) result *= n;
        return result;
    }

    public static int[][] multiply(int[][] A, int[][] B) {
        int m = A.length, n = A[0].length, p = B[0].length;
        int[][] C = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) sum += A[i][k] * B[k][j];
                C[i][j] = sum;
            }
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();

        if (type == 2) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(multiply(arr));

        } else if (type == 3 ){
            int[][] m1 = new int[2][2];
            int[][] m2 = new int[2][2];
            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++)
                    m1[i][j] = sc.nextInt();
            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++)
                    m2[i][j] = sc.nextInt();

            int[][] result = multiply(m1, m2);

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(result[i][j] + (j == 1 ? "" : " "));
                }
                System.out.println();
            }
        }
    }
}

// 행렬곱
// A: (m × n) 행렬, B: (n × p) 행렬 → 결과 C: (m × p) 행렬
// 각 원소 C[i][j]는 A의 i번째 행과 B의 j번째 열을 곱해서 더한 값
// C[i][j] = A[i][0]*B[0][j]
//         + A[i][1]*B[1][j]
//         + ...
//         + A[i][n-1]*B[n-1][j]
// for (k=0; k<n; k++) sum += A[i][k] * B[k][j];
