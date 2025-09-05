package main.java.workbook3.abstractinterface;

import java.util.Scanner;

interface Playable {
    void play();
}

class Piano implements Playable {
    public void play() {
        System.out.println( "Piano plays");
    }
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Guitar plays");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i1 = sc.next();
        String i2 = sc.next();
        Playable inst1 = i1.equals("piano") ? new Piano() : new Guitar();
        Playable inst2 = i2.equals("piano") ? new Piano() : new Guitar();
        inst1.play();
        inst2.play();
    }
}

// 다형성 = 부모 타입 변수로 자식 객체를 참조할 수 있고, 호출되는 메서드는 실제 객체 타입에 따라 달라지는 것