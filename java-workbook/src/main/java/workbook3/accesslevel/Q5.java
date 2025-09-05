package main.java.workbook3.accesslevel;

import java.util.Scanner;

class BankAccount {
    public String accountNo;
    private int balance;
    private String password = "1111";

    BankAccount(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getBalance(String inputPw) {
        if (inputPw.equals(password)) return balance;
        else return -1;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accNo = sc.next();
        int bal = sc.nextInt();
        BankAccount acc = new BankAccount(accNo, bal);

        String cmd1 = sc.next();
        String pw1 = sc.next();
        if (cmd1.equals("get")) {
            int res = acc.getBalance(pw1);
            System.out.println(res >= 0 ? res : "비밀번호 오류");
        }

        String cmd2 = sc.next();
        String pw2 = sc.next();
        if (cmd2.equals("get")) {
            int res = acc.getBalance(pw2);
            System.out.println(res >= 0 ? res : "비밀번호 오류");
        }
    }
}