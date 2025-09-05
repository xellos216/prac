package main.java.workbook2.varcompare;

import java.util.Scanner;

class ChatRoom {
    static int totalUsers = 0;
    String name;
    int messagesSent = 0;

    ChatRoom(String name) {
        this.name = name;
    }

    void sendMessages(int n) {
        messagesSent += n;
        totalUsers += n;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        int m1 = sc.nextInt();
        String name2 = sc.next();
        int m2 = sc.nextInt();
        ChatRoom u1 = new ChatRoom(name1);
        ChatRoom u2 = new ChatRoom(name2);
        u1.sendMessages(m1);
        u2.sendMessages(m2);

        System.out.println(u1.name + " " + u1.messagesSent +" " + ChatRoom.totalUsers);
        System.out.println(u2.name + " " + u2.messagesSent +" " + ChatRoom.totalUsers);
    }
}
