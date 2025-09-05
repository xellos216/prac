package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();

//      heightM = heightCm * 0.01
//      double BMI = weight / (heightM * heightM);

        double BMI = weight / Math.pow(heightCm / 100, 2);
        System.out.println("BMI = " + BMI);
        
        if (BMI >= 30) {
            System.out.print("비만");
        } else if (BMI >= 25) {
            System.out.print("과체중");
        } else if (BMI >= 18.5) {
            System.out.print("정상");
        } else {
            System.out.print("저체중");
        }
    }
}
