package main.java.workbook2.paramtypes;

import java.util.Scanner;

class Pair {
    int a;
    int b;
    Pair(int a, int b) { this.a = a; this.b = b; }
}

public class Q5 {
    public static void swapPair(Pair pair) {
        int temp = pair.a;
        pair.a = pair.b;
        pair.b = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Pair pair = new Pair(x, y);
        swapPair(pair);
        System.out.println(pair.a + " " + pair.b);
    }
}