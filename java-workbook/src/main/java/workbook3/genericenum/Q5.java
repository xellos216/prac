package main.java.workbook3.genericenum;

import java.util.Scanner;

enum Day {MON, TUE, WED, THU, FRI, SAT, SUN}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day day = Day.valueOf(sc.next());
        try {
            switch (day) {
                case MON, TUE, WED, THU, FRI -> System.out.println("Work");
                case SAT, SUN -> System.out.println("Rest");
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}

