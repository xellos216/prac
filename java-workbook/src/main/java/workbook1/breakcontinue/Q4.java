package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j >= 30) continue;
                System.out.printf("%d*%d=%2d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}
