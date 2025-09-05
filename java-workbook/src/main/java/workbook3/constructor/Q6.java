package main.java.workbook3.constructor;

import java.util.Scanner;

class Complex {
    int real;
    int imag;

    Complex () {
        this.real = 0;
        this.imag = 0;
    }

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex other) {
        int newReal = this.real + other.real;
        int newImag = this.imag + other.imag;
        return new Complex(newReal, newImag);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        Complex sum = c1.add(c2);
        System.out.println(sum.real + " " + sum.imag);
    }
}