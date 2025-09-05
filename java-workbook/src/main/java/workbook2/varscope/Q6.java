package main.java.workbook2.varscope;

import java.util.Scanner;

class Bank {
    static int totalBalance = 0;
    int balance;
    Bank(int balance) {
        this.balance = balance;
        totalBalance += balance;
    }

    void deposit(int amount) {
        balance += amount;
        totalBalance += amount;
    }
    void withdraw(int amount) {
        balance -= amount;
        totalBalance -= amount;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal1 = sc.nextInt();
        int bal2 = sc.nextInt();
        Bank acc1 = new Bank(bal1);
        Bank acc2 = new Bank(bal2);

        for (int i = 0; i < 2; i++) {
            String op = sc.next();
            int id = sc.nextInt();
            int amt = sc.nextInt();
            Bank target = (id == 1) ? acc1 : acc2;
            if (op.equals("deposit")) target.deposit(amt);
            else target.withdraw(amt);
        }
            System.out.println(Bank.totalBalance);
        }
    }

