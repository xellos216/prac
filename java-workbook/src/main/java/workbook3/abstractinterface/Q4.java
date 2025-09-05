package main.java.workbook3.abstractinterface;

import java.util.Scanner;

interface Movable {
    void move();
}

class Robot implements Movable {
    public void move() {
        System.out.println( "Robot moves");
    }
}

class Car implements Movable {
    public void move() {
        System.out.println("Car moves");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movable[] objs = new Movable[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            objs[i] = t.equals("robot") ? new Robot() : new Car();
        }
        for (Movable m : objs) {
            m.move();
        }
    }
}

// 인터페이스 = 규격만 정의하는 약속,
// 추상 클래스 = 공통 속성과 동작을 일부 구현까지 제공하는 설계도.