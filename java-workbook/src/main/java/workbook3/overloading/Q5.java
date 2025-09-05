package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q5 {
    public static String format(int a) {
        return "정수: " + a;
    }
    public static String format(String b) {
        return "문자열: " + b;
    }
    public static String format(String name, int age) {
        return name + "(" + age + ")";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        System.out.println(format(age));
        System.out.println(format(name));
        System.out.println(format(name, age));
    }
}
// 메서드 선언 구조 [접근제어자] [수식어] [리턴타입] [메서드이름](매개변수목록) { ... }
// 메서드 호출은 인자의 이름이 아니라 타입(자료형)과 개수로 매칭
