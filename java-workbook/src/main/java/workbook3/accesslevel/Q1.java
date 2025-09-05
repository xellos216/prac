package main.java.workbook3.accesslevel;

import java.util.Scanner;

class Account {
    private int balance;
    Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = sc.nextInt();
        String cmd1 = sc.next();
        int amt1 = sc.nextInt();
        String cmd2 = sc.next();
        int amt2 = sc.nextInt();

        Account acc = new Account(bal);
        if (cmd1.equals("deposit")) {
            acc.deposit(amt1);
        } else {
            acc.withdraw(amt1);
        }
        if (cmd2.equals("deposit")) {
            acc.deposit(amt2);
        } else {
            acc.withdraw(amt2);
        }
        System.out.println(acc.getBalance());
    }
}