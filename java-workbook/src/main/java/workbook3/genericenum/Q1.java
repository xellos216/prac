package main.java.workbook3.genericenum;

import java.util.Scanner;

class GenericBox<T> {
    T value;

    GenericBox(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String s = sc.next();
        GenericBox<Integer> box1 = new GenericBox<>(i);
        GenericBox<String> box2 = new GenericBox<>(s);
        System.out.println(box1.get());
        System.out.println(box2.get());
    }
}