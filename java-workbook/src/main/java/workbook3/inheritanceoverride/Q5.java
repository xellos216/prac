package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

abstract class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    void deposit(int amount) {
        balance += amount + (amount * 5) / 100;
//      balance += amount + (amount * 0.05); double 사용시
    }
}

class CheckingAccount extends Account {
    CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    void withdraw(int amount) {
        balance -= amount + (amount * 1) / 100;
//      balance -= amount + (amount * 0.01); double 사용시
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kind = sc.next(); // "saving" or "checking"
        int initBal = sc.nextInt();

        Account acc = kind.equals("saving")
                ? new SavingsAccount(initBal)
                : new CheckingAccount(initBal);

        while (sc.hasNext()) {
            String cmd = sc.next();
            int amount = sc.nextInt();

            if (cmd.equals("deposit")) {
                acc.deposit(amount);
            } else {
                acc.withdraw(amount);
            }
            System.out.println(acc.balance);
        }
    }
}
