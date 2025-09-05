package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i == 10) break;
            sum += i;
        }
        System.out.print(sum);
    }
}