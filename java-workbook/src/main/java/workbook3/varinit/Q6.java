package main.java.workbook3.varinit;

import java.util.Scanner;

class BankAccount {
    static { System.out.println("KB Bank"); }

    { System.out.println("Account created"); }

    int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        BankAccount a1 = new BankAccount(b1);
        BankAccount a2 = new BankAccount(b2);
        System.out.println(a1.balance);
        System.out.println(a2.balance);
    }
}