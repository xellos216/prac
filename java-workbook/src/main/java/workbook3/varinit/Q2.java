package main.java.workbook3.varinit;

public class Q2 {
    static int count;
    static {
        count = 5;
    }
    public static void main(String[] args) {
        System.out.println(count);
    }
}

// static 변수: 클래스 로딩 시 단 하나만 생성되어 모든 객체가 공유하는 변수