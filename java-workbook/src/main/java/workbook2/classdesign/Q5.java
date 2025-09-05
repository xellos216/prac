package main.java.workbook2.classdesign;

import java.util.Scanner;

class Account {
    String accountNo;
    int balance;

    Account(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount) System.out.println("잔액 부족");
        balance -= amount;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accNo = sc.next();
        int bal = sc.nextInt();
        Account acc = new Account(accNo, bal);

        String cmd1 = sc.next();
        int amt1 = sc.nextInt();
        if (cmd1.equals("deposit")) acc.deposit(amt1);
        else acc.withdraw(amt1);

        String cmd2 = sc.next();
        int amt2 = sc.nextInt();
        if (cmd2.equals("deposit")) acc.deposit(amt2);
        else acc.withdraw(amt2);

        System.out.print(acc.balance);
    }
}
