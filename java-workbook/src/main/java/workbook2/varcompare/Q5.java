package main.java.workbook2.varcompare;

import java.util.Scanner;

class Library {
    static int totalBooks = 0;
    int borrowed = 0;

    void borrow(int n) {
        borrowed += n;
        totalBooks += n;
    }

    void returnBooks(int n) {
        borrowed -= n;
        totalBooks -= n;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library user = new Library();
        int commands = sc.nextInt();
        for (int i = 0; i < commands; i++) {
            String cmd = sc.next();
            int n = sc.nextInt();
            if (cmd.equals("borrow")) user.borrow(n);
            else user.returnBooks(n);
        }
        System.out.println(user.borrowed + " " + Library.totalBooks);
    }
}