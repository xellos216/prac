package main.java.workbook3.genericenum;

import java.util.Scanner;

enum Level { LOW, MEDIUM, HIGH }

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Level level = Level.valueOf(input);
        System.out.println(level);
    }
}

// enum: 타입 안전성을 보장해서 코드 내부에서는 잘못된 상수를 못 쓰게 하고
// 외부 입력에 대해서는 런타임에서 예외로 걸러