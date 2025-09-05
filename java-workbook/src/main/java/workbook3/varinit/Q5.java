package main.java.workbook3.varinit;
import java.util.Scanner;

class InitPerson {
    static int counter = 0;

    static {
        System.out.println("class loaded");
    }

    String name;
    int id;

    {
        id = ++counter;
    }

    InitPerson(String name) {
        this.name = name;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = sc.next();
        InitPerson p1 = new InitPerson(n1);
        InitPerson p2 = new InitPerson(n2);
        InitPerson p3 = new InitPerson(n3);
        System.out.println(p1.name + " " + p1.id);
        System.out.println(p2.name + " " + p2.id);
        System.out.println(p3.name + " " + p3.id);
    }
}

// static 블록: 클래스 로딩 시 단 한 번 실행됨
// static 변수: 모든 객체가 공유, 생성될 때마다 값이 누적됨
// 인스턴스 초기화 블록: 객체 생성 시마다 실행, static 변수 활용해 개별 id 부여
