package main.java.workbook3.genericenum;

import java.util.Scanner;

class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public String toString() {
        return key + ":" + value;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k1 = sc.next();
        int v1 = sc.nextInt();
        String k2 = sc.next();
        String v2 = sc.next();

        Pair<String, Integer> p1 = new Pair<>(k1, v1);
        Pair<String, String> p2 = new Pair<>(k2, v2);

        System.out.println(p1);
        System.out.println(p2);
    }
}

// System.out.println(obj)는 내부적으로 obj.toString()을 자동 호출
// toString()을 오버라이드하지 않으면 기본 구현(Object@해시코드)이 출력
// 제네릭 타입 인자 없이(raw type) 사용 X
// Pair<String, Integer>처럼 타입 인자를 명시