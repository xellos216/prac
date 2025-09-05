package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.print("월요일");
                break;
            case 2:
                System.out.print("화요일");
                break;
            case 3:
                System.out.print("수요일");
                break;
            case 4:
                System.out.print("목요일");
                break;
            case 5:
                System.out.print("금요일");
                break;
            case 6:
                System.out.print("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.print("잘못된 입력");
                break;
        }
    }
}
