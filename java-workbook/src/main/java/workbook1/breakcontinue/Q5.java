package main.java.workbook1.breakcontinue;

public class Q5 {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j == 6) {
                    System.out.printf(("(%d,%d)"), i, j);
                    break outer;
                }
            }
        }
    }
}
