package ru.kpfu.itis.g11704.borisgk98.task57

import java.lang.*;
import java.util.*;

class DivideByZeroException extends ArithmeticException {}

class Fraction {
    private int a = 1, b = 1;
    private boolean sign = true;

    private int gcd(int a, int b) {
        while (b != 0) {
            a %= b;
            int c;
            c = a;
            a = b;
            b = c;
        }
        return a;
    }

    private int lcd(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public int getSign() {
        return (sign ? 1 : -1);
    }

    Fraction(int a, int b, boolean sign) {
        if (b == 0) {
            throw new DivideByZeroException();
        }
        this.sign = sign;
        this.a = a;
        this.b = b;
        normalize();
    }

    Fraction(int a, int b) {
        if (b == 0) {
            throw new DivideByZeroException();
        }
        sign = (a * b >= 0);
        this.a = Math.abs(a);
        this.b = Math.abs(b);
        normalize();
    }

    Fraction(Fraction number) {
        sign = number.sign;
        a = number.a;
        b = number.b;
        normalize();
    }

    private void normalize() {
        int p = gcd(a, b);
        a /= p;
        b /= p;
    }

    Fraction add(Fraction number) {
        int p = gcd(this.b, number.b),
                b = this.b / p * number.b,
                a = this.getSign() * this.a * b / this.b + number.getSign() * number.a * b / number.b;
        boolean sign = (a >= 0);
        return new Fraction(Math.abs(a), Math.abs(b), sign);
    }

    Fraction subtract(Fraction number) {
        int p = gcd(this.b, number.b),
                b = this.b / p * number.b,
                a = this.getSign() * this.a * b / this.b - number.getSign() * number.a * b / number.b;
        boolean sign = (a >= 0);
        return new Fraction(Math.abs(a), Math.abs(b), sign);
    }

    Fraction multiply(Fraction factor) {
        int p1 = gcd(this.a, factor.b), p2 = gcd(this.b, factor.a),
                a = this.a / p1 * factor.a / p2, b = this.b / p2 * factor.b / p1;
        boolean sign = (this.sign ^ factor.sign);
        return new Fraction(Math.abs(a), Math.abs(b), sign);
    }

    Fraction multiply(int factor) {
        return this.multiply(new Fraction(factor, 1));
    }

    float decimal() {
        return (sign ? 1.0f : -1.0f) * a / b;
    }

    public boolean equals(Fraction fraction) {
        return a == fraction.a && b == fraction.b && sign == fraction.sign;
    }

    public String toString() {
        return (sign ? "" : "-") + a + (a == 0 || b == 1 ? "" : "\\" + b);
    }
}

class Task57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Fraction a = new Fraction(scan.nextInt(), scan.nextInt()), b = new Fraction(scan.nextInt(), scan.nextInt());
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.multiply(5));
        System.out.println(a.equals(b));
        System.out.println(a.decimal());
        System.out.println(a);
        System.out.println(b);
    }
}