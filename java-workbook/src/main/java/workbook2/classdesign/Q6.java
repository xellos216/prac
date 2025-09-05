package main.java.workbook2.classdesign;

import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void addSeconds(int n) {
        second += n;
        minute += second / 60;
        second %= 60;
        hour += minute / 60;
        minute %= 60;
        hour %= 24;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int add = sc.nextInt();
        Time time = new Time(h, m, s);
        time.addSeconds(add);
        System.out.println(time.hour + " " + time.minute + " " + time.second);
    }
}