package main.java.workbook2.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3, cols = 3;
        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] C = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            A[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        for (int i = 0; i < rows; i++) {
            B[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//    입력: "1 2 3"
//        │
//        ▼
//    sc.nextLine() -> "1 2 3"
//        │
//        ▼
//    .split(" ") -> ["1", "2", "3"]
//        │
//        ▼
//    Arrays.stream(...) -> Stream<String>
//        │
//        ▼
//    .mapToInt(Integer::parseInt) -> IntStream : [1, 2, 3]
//        │
//        ▼
//    .toArray() -> int[] {1, 2, 3}
//        │
//        ▼
//    A[i] 에 대입