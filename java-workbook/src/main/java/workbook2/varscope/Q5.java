package main.java.workbook2.varscope;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calculator {
    static List<String> history = new ArrayList<>();

    int add(int a, int b) {
        Calculator.history.add(a + " + " + b);
        return a + b;
    }

    int sub(int a, int b) {
        Calculator.history.add(a + " - " + b);
        return a + b;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int[] results = new int[3];
        for (int i = 0; i < 3; i++) {
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (op.equals("add")) results[i] = calc.add(x, y);
            else results[i] = calc.sub(x, y);
        }
        System.out.println(results[0] + " " + results[1] + " " + results[2]);
        System.out.println(String.join(", ", Calculator.history));
    }
}
