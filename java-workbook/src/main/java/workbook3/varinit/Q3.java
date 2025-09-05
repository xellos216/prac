package main.java.workbook3.varinit;

public class Q3 {
    static int s;
    int i;

    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

    Q3() {
        System.out.println("constructor");
    }


    public static void main(String[] args) {
        System.out.println("static variable");
        Q3 obj = new Q3();
        System.out.println("instance variable");
    }
}

// 메모리에 객체 공간 확보
// 인스턴스 변수 초기화
// 인스턴스 초기화 블록 실행
// 생성자 실행