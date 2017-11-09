package ru.kpfu.itis.g11704.borisgk98.task55

import java.lang.*;
import java.util.*;

class Complex implements Cloneable {
    //c = a + bi
    // maybe double?
    private int a, b;

    Complex(Complex num) {
        a = num.getA();
        b = num.getB();
    }

    Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    Complex add(Complex num) {
        return new Complex(a + num.getA(), b + num.getB());
    }

    Complex subtract(Complex num) {
        return new Complex(a - num.getA(), b - num.getB());
    }

    Complex multiply(Complex num) {
        return new Complex(a*num.getA() - b*num.getB(), a*num.getB() + b*num.getA());
    }

    Complex divide(Complex num) {
        if (num.abs() == 0) {
            throw new DivideByZero();
        }
        return new Complex((a*num.getA() - b*num.getB()) / num.abs(), (b*num.getA() - a*num.getB()) / num.abs());
    }

    // maybe double?
    int abs() {
        return (int)Math.round(Math.sqrt((double)a * a + b * b));
    }

    Complex clone(Complex num) {
        return new Complex(num.getA(), num.getB());
    }

    public String toString() {
        return a + " + " + b + "i";
    }

    public boolean equals(Complex num) {
        return a == num.getA() && b == num.getB();
    }
}

class DivideByZero extends ArithmeticException {}

class Task55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Complex a = new Complex(3, 4), b = new Complex(0, 0);
        Complex c = a.add(b), d = a.subtract(b), e = a.multiply(b), f;
        try {
            f = a.divide(b);
        }
        catch (DivideByZero exc) {
            f = new Complex(0, 0);
            System.err.println("Divide by zero error!");
        }
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(a.equals(b));
    }
}