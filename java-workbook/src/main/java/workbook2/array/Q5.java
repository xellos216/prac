package main.java.workbook2.array;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j  + 1];
                    arr[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}

// 1. t에 왼쪽 값(arr[j]) 임시 저장
// 2. 왼쪽(arr[j])에 오른쪽 값(arr[j+1]) 복사 → 두 값이 같아짐
// 3. 오른쪽(arr[j+1])에 t(원래 왼쪽 값) 대입 → 자리 교환한 것이 됌