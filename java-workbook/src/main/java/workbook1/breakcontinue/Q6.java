package main.java.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                sum += i;
                if (sum >= 40) break;
            }
        }
        System.out.print(sum);
    }
}
// 63?