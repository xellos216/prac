package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Converter {
    static double toCelsius(double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }
    double toFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = sc.nextDouble();
        double cRes = Converter.toCelsius(f);
        Converter conv = new Converter();
        double fRes = conv.toFahrenheit(c);

        System.out.println(cRes + " " + fRes);
    }
}
