package ru.kpfu.itis.g11704.borisgk98.task56b

import  java.lang.*;
import java.util.*;

class Point2D {
    protected double x, y;
    Point2D(double PointX, double PointY) {
        x = PointX;
        y = PointY;
    }
    Point2D() {}
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}

class Vector2D extends Point2D {
    Vector2D(double VectorX, double VectorY) {
        super(VectorX, VectorY);
    }

    Vector2D(Point2D p1, Point2D p2) {
        super(p2.getX() - p1.getX(), p2.getY() - p1.getY());
    }

    Vector2D(Vector2D vector) {
        super(vector.getX(), vector.getY());
    }

    public Vector2D add(Vector2D vector) {
        return new Vector2D(x + vector.getX(), y + vector.getY());
    }

    public Vector2D subtract(Vector2D vector) {
        return new Vector2D(x - vector.getX(), y - vector.getY());
    }

    public Vector2D multiply(int factor) {
        return new Vector2D(x * factor, y * factor);
    }

    //clockwise rotation
    //alpha in degrees
    public Vector2D rotate(int alphaInDegrees) {
        return rotate((double) (alphaInDegrees) * Math.PI / 180);
    }

    //clockwise rotation
    //alpha in radian
    public Vector2D rotate(double alphaInRadian) {
        double R = abs(), newAngle = Math.atan2(x, y) + alphaInRadian;
        return new Vector2D(R * Math.cos(newAngle), R * Math.sin(newAngle));
    }

    public double abs() {
        return Math.sqrt(x * x + y * y);
    }

    public void print() {
        System.out.printf("%f %f\n", x, y);
    }
}

interface Task56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vector2D v1 = new Vector2D(new Point2D(scan.nextDouble(), scan.nextDouble()),
                                    new Point2D(scan.nextDouble(), scan.nextDouble())),
                 v2 = new Vector2D(scan.nextDouble(), scan.nextDouble());
        int factor = scan.nextInt(), alpha = scan.nextInt();
        (new Vector2D(v1)).print();
        v1.add(v2).print();
        v1.subtract(v2).print();
        v1.multiply(factor).print();
        v1.rotate(alpha).print();
        System.out.println(v1.abs());
    }
}