package main.java.workbook3.abstractinterface;

import java.util.Scanner;

interface Drawable {
    void draw();
}

interface Rotatable {
    void rotate();
}

class Square implements Drawable, Rotatable {
    public void draw() {
        System.out.println( "Square drawn");
    }

    public void rotate() {
        System.out.println( "Square rotated");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println( "Circle drawn");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.next();
        String t2 = sc.next();
        Drawable d1 = t1.equals("square") ? new Square() : new Circle();
        Drawable d2 = t2.equals("square") ? new Square() : new Circle();
        d1.draw();
        if (d1 instanceof Rotatable) {
            ((Rotatable) d1).rotate();
        }
        d2.draw();
        if (d2 instanceof Rotatable) {
            ((Rotatable) d2).rotate();
        }
    }
}

// d2는 Drawable 타입이라 rotate()를 직접 호출할 수 없음
// 하지만 instanceof로 Rotatable 여부를 확인 후 (Rotatable)로 캐스팅하면
// 실제 객체가 Square일 때만 rotate() 실행, Circle일 경우는 건너뛰므로 에러가 나지 않는다.