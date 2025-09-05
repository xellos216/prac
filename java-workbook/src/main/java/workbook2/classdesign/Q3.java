package main.java.workbook2.classdesign;

import java.util.Scanner;

class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void printInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.next();
        String a1 = sc.next();
        int p1 = sc.nextInt();
        String t2 = sc.next();
        String a2 = sc.next();
        int p2 = sc.nextInt();
        Book b1 = new Book(t1, a1, p1);
        Book b2 = new Book(t2, a2, p2);
        b1.printInfo();
        b2.printInfo();
    }
}